package com.jws.mango.admin.mapper;

import com.jws.mango.admin.model.SysDict;
import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.admin.model.SysMenuExample;
import java.util.List;

import com.jws.mango.core.mapper.CommonMapper;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper extends CommonMapper<SysMenu, Long> {}