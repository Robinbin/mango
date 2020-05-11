package com.jws.mango.admin.controller;

import com.jws.mango.admin.model.SysConfig;
import com.jws.mango.admin.service.SysConfigService;
import com.jws.mango.core.http.HttpResult;
import com.jws.mango.core.model.CommonModel;
import com.jws.mango.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("config")
public class SysConfigController {
    @Autowired
    private SysConfigService sysConfigService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysConfig record) {
        return HttpResult.ok(sysConfigService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult delete(@RequestBody List<SysConfig> records) {
        return HttpResult.ok(sysConfigService.delete(records.stream().map(CommonModel::getId).collect(Collectors.toList())));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysConfigService.findPage(pageRequest));
    }

    @GetMapping("/findByLabel")
    public HttpResult findByLabel(@RequestParam String label) {
        return HttpResult.ok(sysConfigService.findByLabel(label));
    }
}
