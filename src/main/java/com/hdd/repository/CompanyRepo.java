package com.hdd.repository;

import com.hdd.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 公司数据仓库接口
 */
@Repository
public interface CompanyRepo extends JpaRepository<Company,String >, JpaSpecificationExecutor {
    @Query(value="select * from company where comname=?1",nativeQuery = true)
    /**
     * @Query 与 nativeQuery=true 代表是执行原生语句查询 false 代表 HQL查询value 等于执行语句,
     * 后面的？代表是‘要查询的内容’，‘后面的数字1’代表是与下面定义方法的第几条变量（1为第一条）
     * 问号必须后面跟数字 好与定义的方法中传递的变量一一对应
     */

    List<Company> findByNativeSQL(String comname);
    /**
     * 这条语句 与上面定义的注解相对应 与 实体类中注解与定义变量一一对应相同 在接口中 方法也与注解一一对应
     * 调用 findByNativeSQL 方法时 默认执行注解内的value 中的语句
     */

    @Query(value="select * from company where comname like '%?1%'",nativeQuery = true)
    List<Company> findByNativeSQL1(String comname);

    //原生sql语句操作（涉及到数据变动的，如删除和更新，必须加注解@Modifying）
    @Modifying
    @Query(value = "update company set comaddress =?1 where comname=?2",nativeQuery = true)
    void updateByName(String comaddress,String comname);

    //公司唯一性验证(如果已经存在，返回0，否则返回1)
    @Query(value = "select count(*) from company where comname=?1",nativeQuery = true)
    int validateComname(String username);

    //邮箱号唯一性验证(如果已经存在，返回0，否则返回1)
    @Query(value = "select count(*) from company where contactemail=?1",nativeQuery = true)
    int validateEmail(String email);

    //手机号唯一性验证(如果已经存在，返回0，否则返回1)
    @Query(value = "select count(*) from company where contactmobile=?1",nativeQuery = true)
    int validateMobile(String mobile);
}
