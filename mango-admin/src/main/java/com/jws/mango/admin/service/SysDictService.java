package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysDict;
import com.jws.mango.core.service.CurdService;

import java.util.List;

public interface SysDictService extends CurdService<SysDict, Long> {

    List<SysDict> findByLabel(String label);

    int save(SysDict record);
}
