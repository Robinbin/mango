package com.jws.mango.admin.service;

import com.jws.mango.admin.model.SysConfig;
import com.jws.mango.core.service.CurdService;

import java.util.List;

public interface SysConfigService extends CurdService<SysConfig, Long> {

    int save(SysConfig record);

    List<SysConfig> findByLabel(String label);
}
