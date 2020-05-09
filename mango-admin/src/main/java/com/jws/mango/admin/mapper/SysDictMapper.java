package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysDict;
import com.jws.mango.core.mapper.CommonMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDictMapper extends CommonMapper<SysDict, Long> {
    List<SysDict> findPage();

    List<SysDict> findByLabel(@Param("label") String label);

    List<SysDict> findPageByLabel(@Param("label") String label);
}