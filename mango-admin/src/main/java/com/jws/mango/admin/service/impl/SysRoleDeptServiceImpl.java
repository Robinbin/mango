package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysRoleDeptMapper;
import com.jws.mango.admin.model.SysRoleDept;
import com.jws.mango.admin.service.SysRoleDeptService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleDeptServiceImpl extends CurdServiceImpl<SysRoleDept, Long> implements SysRoleDeptService {

    @Autowired
    private SysRoleDeptMapper sysRoleDeptMapper;

    @Override
    protected CommonMapper<SysRoleDept, Long> getCommonMapper() {
        return sysRoleDeptMapper;
    }
}
