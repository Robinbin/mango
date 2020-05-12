package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysUserRole;
import com.jws.mango.core.mapper.CommonMapper;

import java.util.List;

public interface SysUserRoleMapper extends CommonMapper<SysUserRole, Long> {
    List<SysUserRole> findUserRoles(Long userId);

    List<SysUserRole> findPermissions(String userName);
}