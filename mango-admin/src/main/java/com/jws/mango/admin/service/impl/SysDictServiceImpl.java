package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysDictMapper;
import com.jws.mango.admin.model.SysDict;
import com.jws.mango.admin.service.SysDictService;
import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.MybatisPageHelper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDictServiceImpl extends CurdServiceImpl<SysDict, Long> implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    protected CommonMapper getCommonMapper() {
        return sysDictMapper;
    }

    @Override
    public List<SysDict> findByLabel(String label) {
        return sysDictMapper.findByLabel(label);
    }

    @Override
    public int save(SysDict record) {
        if (record.getId() == null || record.getId() == 0) {
            return add(record);
        } else {
            return update(record);
        }
    }

    @Override
    public SysDict findById(Long id) {
        return sysDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label = pageRequest.getParams().get("label");
        if (label != null) {
            return MybatisPageHelper.findPage(pageRequest, sysDictMapper, "findPageByLabel", label);
        } else {
            return MybatisPageHelper.findPage(pageRequest, sysDictMapper);
        }
    }
}
