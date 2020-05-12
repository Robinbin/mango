package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysUserMapper;
import com.jws.mango.admin.mapper.SysUserRoleMapper;
import com.jws.mango.admin.model.SysUser;
import com.jws.mango.admin.model.SysUserRole;
import com.jws.mango.admin.service.SysUserService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends CurdServiceImpl<SysUser, Long> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

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
    public List<SysUserRole> findPermissions(String name) {
        return sysUserRoleMapper.findPermissions(name);
    }

    @Override
    public List<SysUserRole> findUserRoles(Long userid) {
        return sysUserRoleMapper.findUserRoles(userid);
    }
}
