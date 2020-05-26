package com.jws.mango.core.mapper;

import java.io.Serializable;
import java.util.List;

public interface CommonMapper<T, ID extends Serializable> {
    long countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(T example);

    T selectByPrimaryKey(ID id);

    int updateByExampleSelective(T record, T example);

    int updateByExample(T record, T example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> findAll();
}
