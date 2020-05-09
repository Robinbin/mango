package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysMenuMapper;
import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.admin.service.SysMenuService;
import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl extends  CurdServiceImpl<SysMenu, Long> implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    protected CommonMapper<SysMenu, Long> getCommonMapper() {
        return sysMenuMapper;
    }
}
