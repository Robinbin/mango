package com.jws.mango.backup.service.impl;

import com.jws.mango.backup.service.MysqlBackupService;
import com.jws.mango.backup.utils.MysqlAdminUtils;
import org.springframework.stereotype.Service;

@Service
public class MysqlBackupServiceImpl implements MysqlBackupService {
    @Override
    public boolean backup(String host, String username, String password, String database, String backupFolderPath, String filename) throws Exception {
        return MysqlAdminUtils.backup(host, username, password, database, backupFolderPath, filename);
    }

    @Override
    public String restore(String host, String username, String password, String database, String backupFolderPath) throws Exception {
        return MysqlAdminUtils.restore(host, username, password, database, backupFolderPath);
    }
}
