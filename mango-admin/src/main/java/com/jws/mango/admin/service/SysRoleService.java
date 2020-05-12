package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.model.SysRoleMenu;
import com.jws.mango.core.service.CurdService;

import java.util.List;

public interface SysRoleService extends CurdService<SysRole, Long> {
    List<SysRoleMenu> findRoleMenus(Long roleId);

    int saveRoleMenu(List<SysRoleMenu> sysRoleMenus);

    int save(SysRole record);
}
