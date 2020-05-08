package com.jws.mango.core.service;

import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.model.CommonModel;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.util.List;

public interface CurdService<T, E> {
    int add(T record);

    int update(T record);

    int delete(T record);

    int delete(List<E> ids);

    T findById(Long id);

    PageResult findPage(PageRequest pageRequest);
}
