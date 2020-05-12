package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.core.mapper.CommonMapper;

import java.util.List;

public interface SysMenuMapper extends CommonMapper<SysMenu, Long> {
    List<SysMenu> findMenuTree();

    List<SysMenu> findNavTree(String userName);
}