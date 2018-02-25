package cn.amos.web.controller;

import cn.amos.core.business.HelloBusiness;
import cn.amos.web.config.AppConfig;
import cn.amos.web.config.RedisConfig;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * PROJECT: boot
 *
 * @author DaoYuanWang
 * @date 2018/1/11
 */
@Controller
public class HelloController {
    @Value("${project}")
    private String project;
    @Resource
    private AppConfig appConfig;
    @Resource
    private RedisConfig redisConfig;
    @Resource
    private HelloBusiness helloBusiness;

    @GetMapping("hello")
    @ResponseBody
    public String sayHello() {
        return helloBusiness.sayHello() + "<br/>" + JSON.toJSONString(appConfig) + "<br/>" + JSON.toJSONString(redisConfig);
    }

    @RequestMapping("page")
    public String helloPage() {
        return "parameterError";
    }
}
