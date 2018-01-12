package cn.amos.web.controller;

import cn.amos.core.business.HelloBusiness;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * PROJECT: boot
 * DATE: 2018/1/11
 *
 * @author DaoYuanWang
 */
@RestController
public class HelloController {

    @Resource
    private HelloBusiness helloBusiness;

    @RequestMapping("hello")
    public String sayHello() {
        return helloBusiness.sayHello();
    }
}
