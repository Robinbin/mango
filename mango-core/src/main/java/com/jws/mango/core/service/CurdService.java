package com.jws.mango.core.service;

import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.io.Serializable;
import java.util.List;

public interface CurdService<T, ID extends Serializable> {
    int add(T record);

    int update(T record);

    int delete(ID id);

    int delete(List<ID> ids);

    T findById(ID id);

    List<T> findAll();

    PageResult findPage(PageRequest pageRequest);
}
