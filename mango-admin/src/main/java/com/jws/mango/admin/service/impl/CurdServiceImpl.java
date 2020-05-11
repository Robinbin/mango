package com.jws.mango.admin.service.impl;

import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.MybatisPageHelper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import com.jws.mango.core.service.CurdService;

import java.io.Serializable;
import java.util.List;

public abstract class CurdServiceImpl<T, ID extends Serializable> implements CurdService<T, ID> {
    protected abstract CommonMapper<T, ID> getCommonMapper();

    @Override
    public int add(T record) {
        return getCommonMapper().insert(record);
    }

    @Override
    public int update(T record) {
        return getCommonMapper().updateByPrimaryKey(record);
    }

    @Override
    public int delete(ID id) {
        return getCommonMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int delete(List<ID> ids) {
        ids.forEach(id -> getCommonMapper().deleteByPrimaryKey(id));

        return ids.size();
    }

    @Override
    public T findById(ID id) {
        return getCommonMapper().selectByPrimaryKey(id);
    }

    @Override
    public List<T> findAll() {
        return getCommonMapper().findAll();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, getCommonMapper());
    }
}
