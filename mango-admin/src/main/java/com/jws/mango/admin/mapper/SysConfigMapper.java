package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysConfig;
import com.jws.mango.core.mapper.CommonMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysConfigMapper extends CommonMapper<SysConfig, Long> {
    List<SysConfig> findByLabel(@Param("label") String label);
}
