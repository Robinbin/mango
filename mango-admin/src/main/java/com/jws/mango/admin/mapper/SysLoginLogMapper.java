package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysDict;
import com.jws.mango.admin.model.SysLoginLog;
import com.jws.mango.admin.model.SysLoginLogExample;
import java.util.List;

import com.jws.mango.core.mapper.CommonMapper;
import org.apache.ibatis.annotations.Param;

public interface SysLoginLogMapper extends CommonMapper<SysLoginLog, Long> {
}