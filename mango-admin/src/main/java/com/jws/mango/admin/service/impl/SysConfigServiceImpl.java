package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysConfigMapper;
import com.jws.mango.admin.model.SysConfig;
import com.jws.mango.admin.service.SysConfigService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysConfigServiceImpl extends CurdServiceImpl<SysConfig, Long> implements SysConfigService {

    @Autowired
    private SysConfigMapper sysConfigMapper;

    @Override
    protected CommonMapper<SysConfig, Long> getCommonMapper() {
        return sysConfigMapper;
    }

    @Override
    public int save(SysConfig record) {
        if (record.getId() == null || record.getId() == 0) {
            return add(record);
        } else {
            return update(record);
        }
    }

    @Override
    public List<SysConfig> findByLabel(String label) {
        return sysConfigMapper.findByLabel(label);
    }
}
