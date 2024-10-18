package me.zhyd.justauth.config;

import me.zhyd.oauth.config.AuthConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "auth")
public class AuthProperties {

    private Map<String, AuthConfig> tirdType=new HashMap<>();


    public Map<String, AuthConfig> getTirdType() {
        return tirdType;
    }
    public void setTirdType(Map<String, AuthConfig> tirdType) {
        this.tirdType = tirdType;
    }
}