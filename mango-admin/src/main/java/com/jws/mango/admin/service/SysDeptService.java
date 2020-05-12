package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysDept;
import com.jws.mango.core.service.CurdService;

import java.util.List;

public interface SysDeptService extends CurdService<SysDept, Long> {
    int save(SysDept record);

    List<SysDept> findTree();
}
