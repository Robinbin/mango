package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysRoleMenuMapper;
import com.jws.mango.admin.model.SysRoleMenu;
import com.jws.mango.admin.service.SysRoleMenuService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleMenuServiceImpl extends CurdServiceImpl<SysRoleMenu, Long> implements SysRoleMenuService {
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    protected CommonMapper<SysRoleMenu, Long> getCommonMapper() {
        return sysRoleMenuMapper;
    }
}
