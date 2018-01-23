package cn.amos.web.controller;

import cn.amos.core.business.HelloBusiness;
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

    @Resource
    private HelloBusiness helloBusiness;

    @GetMapping("hello")
    @ResponseBody
    public String sayHello() {
        return helloBusiness.sayHello();
    }

    @RequestMapping("page")
    public String helloPage() {
        return "parameterError";
    }
}
