package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.model.SysDept;
import com.jws.mango.admin.service.SysDeptService;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.util.List;

public class SysDeptServiceImpl implements SysDeptService {
    @Override
    public int save(SysDept record) {
        return 0;
    }

    @Override
    public int delete(SysDept record) {
        return 0;
    }

    @Override
    public int delete(List<SysDept> records) {
        return 0;
    }

    @Override
    public SysDept findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
