package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.model.SysLoginLog;
import com.jws.mango.admin.service.SysLoginLogService;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.util.List;

public class SysLoginLogServiceImpl implements SysLoginLogService {
    @Override
    public int save(SysLoginLog record) {
        return 0;
    }

    @Override
    public int delete(SysLoginLog record) {
        return 0;
    }

    @Override
    public int delete(List<SysLoginLog> records) {
        return 0;
    }

    @Override
    public SysLoginLog findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
