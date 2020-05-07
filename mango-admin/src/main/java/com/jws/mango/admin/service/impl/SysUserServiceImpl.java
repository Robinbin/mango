package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysUserMapper;
import com.jws.mango.admin.model.SysUser;
import com.jws.mango.admin.service.SysUserService;
import com.jws.mango.core.page.MybatisPageHelper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    @Override
    public int save(SysUser record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysUserMapper.insertSelective(record);
        } else {
            return sysUserMapper.updateByPrimaryKey(record);
        }
    }

    @Override
    public int delete(SysUser record) {
        Objects.requireNonNull(record);

        return sysUserMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysUser> records) {
        int count = 0;

        for (SysUser user : records) {
            count += delete(user);
        }

        return count;
    }

    @Override
    public SysUser findById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
    }
}
