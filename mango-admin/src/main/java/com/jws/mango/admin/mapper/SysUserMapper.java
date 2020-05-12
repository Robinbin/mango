package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysUser;
import com.jws.mango.core.mapper.CommonMapper;

import java.util.List;

public interface SysUserMapper extends CommonMapper<SysUser, Long> {
    List<SysUser> findAll();

    List<SysUser> findPage();

    List<SysUser> findByName(String name);
}