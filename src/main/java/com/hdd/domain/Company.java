package com.hdd.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/*
公司实体类
 */
@Entity     //声明这是一个实体类
@Table(name = "company")
//表示要创建的表 叫company 一般与类名保持一致 IDEA 就会自动在mariaDB 里面进行配置
//因为已经再配置文件yml里面 配置好了 数据库对应 和 类型（类型是update 所以 在实体类中再次加入字段 跑一次之后 数据库也会跟新 但如果在实体类里面加了之后 再从
// 实体类中删掉 并不会把这个字段再删掉） 所以他会自动生成数据表
//@Data       //减少实体类生成get和set方法的代码
public class Company {
    @Id
    //注解 表明此字段 为主键
    @GeneratedValue(generator = "myuuid")
    //这个是JPA的主键生成器注解 下面这个是hibernate 的主键生成器注解 因为Jpa并没有uuid主键生成策略 而Hibernate是Jpa的扩展
    //里面有丰富的主键生成策略 所以可以用Hibernate
    @GenericGenerator(name="myuuid",strategy = "uuid")
    // myuuid 前后两个一定要保持一致 至于名字是什么 都无所谓 只要一致就可以 后面的uuid 必须得是uuid 表示是uuid主键类型
    // uuid采用128位uuid算法生成主键 被编码为一个32位16进制数字的字符串 占用空间大（字符串类型）
    // 也可以用identity 自增主键 虽然不能用到Oracle中，但MySQL和SQLServer 中很常用

    @Column(length = 32)
    private String uuid;

    @Column(length = 60)
    private String comname;

    @Column(length = 120)
    private String comaddress;

    @Column(length = 30)
    private String comurl;

    @Column(length = 30)
    private String comtelephone;

    @Column(columnDefinition = "char(7)")  // 万能定义语句 直接按数据库里面定义类型输入即可
    private String establishdate;

    @Column     //// 整型直接不用指定长度 直接注解跟数据库字段一一对应即可
    private int employeenumber;

    @Column(columnDefinition = "float(20,4) default '0.00'")
    // 万能定义语句 直接按数据库里面定义类型输入即可 后面的是默认值这个必须得输入 因为浮点型 没有默认值报错
    private float totaloutput;

    @Column(columnDefinition = "text")
    private String comdesc;

    @Column(columnDefinition = "char(4)")
    private String comstatus;

    @Column(length = 20)
    private String contactname;

    @Column(columnDefinition = "char(11)")
    private String contactmobile;

    @Column(length = 30)
    private String contactemail;

    @Column(length = 500)
    private String upload;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComaddress() {
        return comaddress;
    }

    public void setComaddress(String comaddress) {
        this.comaddress = comaddress;
    }

    public String getComurl() {
        return comurl;
    }

    public void setComurl(String comurl) {
        this.comurl = comurl;
    }

    public String getComtelephone() {
        return comtelephone;
    }

    public void setComtelephone(String comtelephone) {
        this.comtelephone = comtelephone;
    }

    public String getEstablishdate() {
        return establishdate;
    }

    public void setEstablishdate(String establishdate) {
        this.establishdate = establishdate;
    }

    public int getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(int employeenumber) {
        this.employeenumber = employeenumber;
    }

    public float getTotaloutput() {
        return totaloutput;
    }

    public void setTotaloutput(float totaloutput) {
        this.totaloutput = totaloutput;
    }

    public String getComdesc() {
        return comdesc;
    }

    public void setComdesc(String comdesc) {
        this.comdesc = comdesc;
    }

    public String getComstatus() {
        return comstatus;
    }

    public void setComstatus(String comstatus) {
        this.comstatus = comstatus;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContactmobile() {
        return contactmobile;
    }

    public void setContactmobile(String contactmobile) {
        this.contactmobile = contactmobile;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }
}
