package com.jws.mango.admin.controller;

import com.jws.mango.admin.model.SysUser;
import com.jws.mango.admin.service.SysUserService;
import com.jws.mango.core.http.HttpResult;
import com.jws.mango.core.page.PageRequest;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

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
}
