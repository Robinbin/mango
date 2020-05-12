package com.jws.mango.admin.controller;


import com.jws.mango.admin.model.SysMenu;
import com.jws.mango.admin.service.SysMenuService;
import com.jws.mango.core.http.HttpResult;
import com.jws.mango.core.model.CommonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("menu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysMenu record) {
        return HttpResult.ok(sysMenuService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult save(@RequestBody List<SysMenu> records) {
        return HttpResult.ok(sysMenuService.delete(records.stream().map(CommonModel::getId).collect(Collectors.toList())));
    }

    @PostMapping("/findNavTree")
    public HttpResult findNavTree(@RequestBody String userName) {
        return HttpResult.ok(sysMenuService.findNavTree(userName));
    }

    @PostMapping("/findMenuTree")
    public HttpResult findMenuTree() {
        return HttpResult.ok(sysMenuService.findMenuTree());
    }
}
