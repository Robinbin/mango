package com.jws.mango.admin.controller;


import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.model.SysRoleMenu;
import com.jws.mango.admin.service.SysRoleService;
import com.jws.mango.core.http.HttpResult;
import com.jws.mango.core.model.CommonModel;
import com.jws.mango.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("role")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysRole record) {
        return HttpResult.ok(sysRoleService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult save(@RequestBody List<SysMenu> records) {
        return HttpResult.ok(sysRoleService.delete(records.stream().map(CommonModel::getId).collect(Collectors.toList())));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysRoleService.findPage(pageRequest));
    }

    @PostMapping("/findAll")
    public HttpResult findAll() {
        return HttpResult.ok(sysRoleService.findAll());
    }

    @PostMapping("/findRoleMenus")
    public HttpResult findRoleMenus(@RequestBody Long roleId) {
        return HttpResult.ok(sysRoleService.findRoleMenus(roleId));
    }

    @PostMapping("/saveRoleMenu")
    public HttpResult saveRoleMenu(@RequestBody List<SysRoleMenu> sysRoleMenus) {
        return HttpResult.ok(sysRoleService.saveRoleMenu(sysRoleMenus));
    }
}
