package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysLoginLogMapper;
import com.jws.mango.admin.model.SysDept;
import com.jws.mango.admin.model.SysLoginLog;
import com.jws.mango.admin.service.SysLoginLogService;
import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLoginLogServiceImpl extends CurdServiceImpl<SysLoginLog, Long> implements SysLoginLogService {

    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;

    @Override
    protected CommonMapper<SysLoginLog, Long> getCommonMapper() {
        return sysLoginLogMapper;
    }
}
