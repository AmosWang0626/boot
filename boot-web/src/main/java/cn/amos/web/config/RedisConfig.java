package cn.amos.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * PROJECT: boot
 * DATE: 2018/2/25
 *
 * @author DaoyuanWang
 */
@Component
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {
    private Integer port;
    private String uri;
    private String password;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
