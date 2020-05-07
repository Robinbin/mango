package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysDictMapper;
import com.jws.mango.admin.model.SysDict;
import com.jws.mango.admin.service.SysDictService;
import com.jws.mango.core.page.MybatisPageHelper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    public List<SysDict> findByLabel(String label) {
        return sysDictMapper.findByLabel(label);
    }

    @Override
    public int save(SysDict record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysDictMapper.insertSelective(record);
        } else {
            return sysDictMapper.updateByPrimaryKey(record);
        }
    }

    @Override
    public int delete(@NonNull SysDict record) {
        Objects.requireNonNull(record);

        return sysDictMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysDict> records) {
        int count = 0;
        for (SysDict record : records) {
            count += sysDictMapper.deleteByPrimaryKey(record.getId());
        }

        return count;
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
