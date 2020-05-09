package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysLogMapper;
import com.jws.mango.admin.model.SysDept;
import com.jws.mango.admin.model.SysLog;
import com.jws.mango.admin.service.SysLogService;
import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl extends CurdServiceImpl<SysLog, Long> implements SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    protected CommonMapper<SysLog, Long> getCommonMapper() {
        return sysLogMapper;
    }
}
