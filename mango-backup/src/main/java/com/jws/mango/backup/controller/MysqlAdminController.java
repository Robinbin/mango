package com.jws.mango.backup.controller;

import com.jws.mango.backup.HttpResult;
import com.jws.mango.backup.config.BackupDatabaseProperties;
import com.jws.mango.backup.service.MysqlBackupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlAdminController {
    @Autowired
    private MysqlBackupService mysqlBackupService;

    @Autowired
    private BackupDatabaseProperties properties;

    @PostMapping("/backup")
    public HttpResult backup() throws Exception {
        return HttpResult.ok(mysqlBackupService.backup(properties.getHost(),
                properties.getUsername(),
                properties.getPassword(),
                properties.getDatabase(),
                "test",
                "test"));
    }

    @PostMapping("restore")
    public HttpResult restore() throws Exception {
        return HttpResult.ok(mysqlBackupService.restore(properties.getHost(),
                properties.getUsername(),
                properties.getPassword(),
                properties.getDatabase(),
                "test"));
    }

    @GetMapping("/findRecords")
    public HttpResult findBackupRecords() {
        //TODO
        return HttpResult.ok();
    }

    @GetMapping("/delete")
    public HttpResult delete(@RequestParam String name) {
        //TODO
        return HttpResult.ok();
    }
}
