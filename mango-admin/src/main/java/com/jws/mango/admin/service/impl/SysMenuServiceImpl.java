package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysMenuMapper;
import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.admin.service.SysMenuService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysMenuServiceImpl extends CurdServiceImpl<SysMenu, Long> implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    protected CommonMapper<SysMenu, Long> getCommonMapper() {
        return sysMenuMapper;
    }

    @Override
    public int save(SysMenu record) {
        if (record.getId() == null || record.getId() == 0) {
            return add(record);
        } else {
            return update(record);
        }
    }
}
