package com.jws.mango.backup.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mango.backup.database")
@Setter
@Getter
public class BackupDatabaseProperties {
    private String host;
    private String username;
    private String password;
    private String database;

}
