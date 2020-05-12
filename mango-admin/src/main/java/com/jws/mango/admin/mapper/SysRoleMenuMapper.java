package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysRoleMenu;
import com.jws.mango.core.mapper.CommonMapper;

import java.util.List;

public interface SysRoleMenuMapper extends CommonMapper<SysRoleMenu, Long> {
    List<SysRoleMenu> findRoleMenus(Long roleId);
}