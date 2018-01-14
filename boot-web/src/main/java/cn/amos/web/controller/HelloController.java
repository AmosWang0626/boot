package cn.amos.web.controller;

import cn.amos.core.business.HelloBusiness;
import cn.amos.dao.mappers.UserMapper;
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

    @Resource
    private UserMapper userMapper;

    @RequestMapping("hello")
    public String sayHello() {
        /*return helloBusiness.sayHello();*/
        return userMapper.selectById(1L).toString();
    }
}
