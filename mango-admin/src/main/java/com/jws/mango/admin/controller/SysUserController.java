package com.jws.mango.admin.controller;

import com.jws.mango.admin.model.SysRole;
import com.jws.mango.admin.model.SysUser;
import com.jws.mango.admin.service.SysRoleService;
import com.jws.mango.admin.service.SysUserService;
import com.jws.mango.core.http.HttpResult;
import com.jws.mango.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping(value = "/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }

    @PostMapping(value = "/")
    public HttpResult addSysUser(@RequestBody SysUser sysUser) {
        return HttpResult.ok(sysUserService.save(sysUser));
    }

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysRole sysRole) {
        return HttpResult.ok(sysRoleService.add(sysRole));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysRole> sysRoles) {
        return HttpResult.ok(sysRoleService.delete(sysRoles.stream().map(SysRole::getId).collect(Collectors.toList())));
    }

    @PostMapping(value = "/findByName")
    public HttpResult findByName(@RequestBody String name) {
        return HttpResult.ok(sysUserService.findByName(name));
    }

    @PostMapping(value = "/findPermissions")
    public HttpResult findPermissions(@RequestBody String name) {
        return HttpResult.ok(sysUserService.findPermissions(name));
    }

    @PostMapping(value = "/findUserRoles")
    public HttpResult findUserRoles(@RequestBody Long userid) {
        return HttpResult.ok(sysUserService.findUserRoles(userid));
    }
}
