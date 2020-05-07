package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.service.SysRoleService;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.util.List;

public class SysRoleServiceImpl implements SysRoleService {
    @Override
    public int save(SysRole record) {
        return 0;
    }

    @Override
    public int delete(SysRole record) {
        return 0;
    }

    @Override
    public int delete(List<SysRole> records) {
        return 0;
    }

    @Override
    public SysRole findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
