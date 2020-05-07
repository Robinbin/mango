package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.model.SysConfig;
import com.jws.mango.admin.service.SysConfigService;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.util.List;

public class SysConfigServiceImpl implements SysConfigService {
    @Override
    public int save(SysConfig record) {
        return 0;
    }

    @Override
    public int delete(SysConfig record) {
        return 0;
    }

    @Override
    public int delete(List<SysConfig> records) {
        return 0;
    }

    @Override
    public SysConfig findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
