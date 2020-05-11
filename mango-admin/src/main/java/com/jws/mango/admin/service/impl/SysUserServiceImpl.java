package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysUserMapper;
import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.model.SysUser;
import com.jws.mango.admin.service.SysUserService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends CurdServiceImpl<SysUser, Long> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    protected CommonMapper<SysUser, Long> getCommonMapper() {
        return sysUserMapper;
    }

    @Override
    public int save(SysUser sysUser) {
        if (sysUser.getId() == null || sysUser.getId() == 0) {
            return add(sysUser);
        } else {
            return update(sysUser);
        }
    }

    @Override
    public List<SysUser> findByName(String name) {
        return sysUserMapper.findByName(name);
    }

    @Override
    public List<SysRole> findPermissions(String name) {
        return sysUserMapper.findPermissions(name);
    }
}
