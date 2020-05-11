package com.jws.mango.admin.controller;


import com.jws.mango.admin.model.SysLog;
import com.jws.mango.admin.service.SysLoginLogService;
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
@RequestMapping("loginlog")
public class SysLoginLogController {
    @Autowired
    private SysLoginLogService sysLoginLogService;

    @PostMapping("/delete")
    public HttpResult delete(@RequestBody List<SysLog> records) {
        return HttpResult.ok(sysLoginLogService.delete(records.stream().map(CommonModel::getId).collect(Collectors.toList())));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysLoginLogService.findPage(pageRequest));
    }
}
