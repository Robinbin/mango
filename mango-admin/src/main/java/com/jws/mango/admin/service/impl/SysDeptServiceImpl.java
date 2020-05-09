package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysDeptMapper;
import com.jws.mango.admin.model.SysDept;
import com.jws.mango.admin.service.SysDeptService;
import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDeptServiceImpl extends CurdServiceImpl<SysDept, Long> implements SysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    protected CommonMapper<SysDept, Long> getCommonMapper() {
        return sysDeptMapper;
    }
}
