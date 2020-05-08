package com.jws.mango.admin.service.impl;

import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.service.CurdService;
import org.springframework.lang.NonNull;

import java.util.List;

public abstract class CurdServiceImpl<T, E> implements CurdService {
    protected abstract CommonMapper<T> getCommonMapper();

    @Override
    public int add(Object record) {
        return 0;
    }

    @Override
    public int update(Object record) {
        return 0;
    }

    @Override
    public int delete(Object record) {
        return 0;
    }

    @Override
    public int delete(List ids) {
        return 0;
    }

    @Override
    public Object findById(Long id) {
        return null;
    }
}
