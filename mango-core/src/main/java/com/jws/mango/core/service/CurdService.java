package com.jws.mango.core.service;

import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;

import java.util.List;

public interface CurdService<T> {
    int save(T record);

    int delete(T record);

    int delete(List<T> records);

    T findById(Long id);

    PageResult findPage(PageRequest pageRequest);
}
