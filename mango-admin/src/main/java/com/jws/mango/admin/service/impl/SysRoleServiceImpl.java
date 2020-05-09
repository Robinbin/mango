package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysRoleMapper;
import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.service.SysRoleService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends CurdServiceImpl<SysRole, Long> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    protected CommonMapper<SysRole, Long> getCommonMapper() {
        return sysRoleMapper;
    }
}
