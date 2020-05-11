package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.model.SysUser;
import com.jws.mango.core.service.CurdService;

import java.util.List;

public interface SysUserService extends CurdService<SysUser, Long> {

    int save(SysUser sysUser);

    List<SysUser> findByName(String name);

    List<SysRole> findPermissions(String name);
}
