package com.jws.mango.admin.controller;


import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.admin.service.SysMenuService;
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
@RequestMapping("log")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysMenu record) {
        return HttpResult.ok(sysMenuService.save(record));
    }

    @PostMapping("/save")
    public HttpResult save(@RequestBody List<SysMenu> records) {
        return HttpResult.ok(sysMenuService.delete(records.stream().map(CommonModel::getId).collect(Collectors.toList())));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysMenuService.findPage(pageRequest));
    }
}
