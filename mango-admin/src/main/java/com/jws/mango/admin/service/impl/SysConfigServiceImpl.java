package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysConfigMapper;
import com.jws.mango.admin.model.SysConfig;
import com.jws.mango.admin.service.SysConfigService;
import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SysConfigServiceImpl extends CurdServiceImpl<SysConfig, Long> implements SysConfigService {

    @Autowired
    private SysConfigMapper sysConfigMapper;

    @Override
    protected CommonMapper<SysConfig, Long> getCommonMapper() {
        return sysConfigMapper;
    }
}
