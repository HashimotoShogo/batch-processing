package com.example.batchprocessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SettingInfo {

    @Autowired
    private SettingMysql settingMysql;

    public String getUrl() {
        return settingMysql.getUrl();
    }

    public String getUserName() {
        return settingMysql.getUsername();
    }

    public String getPassword() {
        return settingMysql.getPassword();
    }


}
