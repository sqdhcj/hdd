package com.hdd.service.impl;

import com.hdd.domain.SysRole;
import com.hdd.repository.SysRoleRepo;
import com.hdd.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 角色业务层实现类
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService
{
    @Autowired
    private SysRoleRepo sysRoleRepo;

    @Override
    public SysRole findByUuid(String uuid)
    {
        return sysRoleRepo.findByUuid(uuid);
    }

    @Override
    public List<SysRole> findALL()
    {
        return sysRoleRepo.findAll();
    }


    @Override
    public void save(SysRole sysRole)
    {
        sysRoleRepo.save(sysRole);
    }

    @Override
    @Transactional
    public void deleteByUuid(String uuid)
    {
        sysRoleRepo.deleteByUuid(uuid);
    }

    @Override
    @Transactional
    public void deleteMaptabByUuid(String uuid)
    {
        sysRoleRepo.deleteMaptabByUuid(uuid);
    }


}
