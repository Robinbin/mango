package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.admin.service.SysMenuService;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.util.List;

public class SysMenuServiceImpl implements SysMenuService {
    @Override
    public int save(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(List<SysMenu> records) {
        return 0;
    }

    @Override
    public SysMenu findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
