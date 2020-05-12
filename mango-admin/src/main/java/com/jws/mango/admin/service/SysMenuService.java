package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.core.service.CurdService;

import java.util.List;

public interface SysMenuService extends CurdService<SysMenu, Long> {
    int save(SysMenu record);

    List<SysMenu> findNavTree(String userName);

    List<SysMenu> findMenuTree();
}
