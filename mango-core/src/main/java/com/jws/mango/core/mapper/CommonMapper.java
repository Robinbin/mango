package com.jws.mango.core.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonMapper<T> {
    long countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(T example);

    T selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") T example);

    int updateByExample(@Param("record") T record, @Param("example") T example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
