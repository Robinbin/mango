package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysUser;
import com.jws.mango.core.service.CurdService;

import java.util.List;

public interface SysUserService extends CurdService<SysUser, Long> {

    int save(SysUser sysUser);
}
