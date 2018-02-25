package cn.amos.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * PROJECT: boot
 * DATE: 2018/2/25
 *
 * @author DaoyuanWang
 */
@Component
@ConfigurationProperties(prefix = "other")
public class AppConfig {
    private Map<String, String> mongoDB;
    private Map<String, String> emay;

    public Map<String, String> getMongoDB() {
        return mongoDB;
    }

    public void setMongoDB(Map<String, String> mongoDB) {
        this.mongoDB = mongoDB;
    }

    public Map<String, String> getEmay() {
        return emay;
    }

    public void setEmay(Map<String, String> emay) {
        this.emay = emay;
    }

    public String getMongoDBUser() {
        return mongoDB.get("user");
    }

    public String getMongoDBUri() {
        return mongoDB.get("uri");
    }

    public String getMongoDBPassword() {
        return mongoDB.get("password");
    }

    public String getEMayUri() {
        return emay.get("uri");
    }

    public String getEMaySign() {
        return emay.get("sign");
    }
}
