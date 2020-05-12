package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysRoleMapper;
import com.jws.mango.admin.mapper.SysRoleMenuMapper;
import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.model.SysRoleMenu;
import com.jws.mango.admin.service.SysRoleService;
import com.jws.mango.core.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl extends CurdServiceImpl<SysRole, Long> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    protected CommonMapper<SysRole, Long> getCommonMapper() {
        return sysRoleMapper;
    }

    @Override
    public List<SysRoleMenu> findRoleMenus(Long roleId) {
        return sysRoleMenuMapper.findRoleMenus(roleId);
    }

    @Override
    public int saveRoleMenu(List<SysRoleMenu> sysRoleMenus) {
        sysRoleMenus.forEach(sysRoleMenu -> {
            if (sysRoleMenu.getId() == null || sysRoleMenu.getId() == 0) {
                sysRoleMenuMapper.insert(sysRoleMenu);
            } else {
                sysRoleMenuMapper.updateByPrimaryKey(sysRoleMenu);
            }
        });
        return 0;
    }

    @Override
    public int save(SysRole record) {
        if (record.getId() == null || record.getId() == 0) {
            return add(record);
        } else {
            return update(record);
        }
    }
}
