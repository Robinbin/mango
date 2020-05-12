package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysUser;
import com.jws.mango.admin.model.SysUserRole;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.service.CurdService;

import java.io.File;
import java.util.List;

public interface SysUserService extends CurdService<SysUser, Long> {

    int save(SysUser sysUser);

    List<SysUser> findByName(String name);

    List<SysUserRole> findPermissions(String name);

    List<SysUserRole> findUserRoles(Long userid);

    File createUserExcelFile(PageRequest pageRequest);
}
