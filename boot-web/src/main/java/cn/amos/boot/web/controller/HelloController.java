package cn.amos.boot.web.controller;

import cn.amos.boot.core.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 模块名称: boot
 * 模块描述: HelloController
 *
 * @author amos.wang
 * @date 2021/2/7 10:29
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.sayHello();
    }

}
