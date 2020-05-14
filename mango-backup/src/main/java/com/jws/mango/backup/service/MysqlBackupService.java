package com.jws.mango.backup.service;

public interface MysqlBackupService {
    boolean backup(String host, String username, String password, String backupFolderPath, String filename, String database) throws Exception;

    String restore(String backupFolderPath, String host, String username, String password, String database) throws Exception;
}
