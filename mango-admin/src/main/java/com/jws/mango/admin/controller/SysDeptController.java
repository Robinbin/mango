package com.jws.mango.admin.controller;


import com.jws.mango.admin.model.SysDept;
import com.jws.mango.admin.service.SysDeptService;
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
@RequestMapping("dept")
public class SysDeptController {
    @Autowired
    private SysDeptService sysDeptService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysDept record) {
        return HttpResult.ok(sysDeptService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult save(@RequestBody List<SysDept> records) {
        return HttpResult.ok(sysDeptService.delete(records.stream().map(CommonModel::getId).collect(Collectors.toList())));
    }

    @PostMapping("/findTree")
    public HttpResult findTree() {
        return HttpResult.ok(sysDeptService.findTree());
    }

}
