package cn.amos.boot.core.service.impl;

import cn.amos.boot.core.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * 模块名称: boot
 * 模块描述: HelloServiceImpl
 *
 * @author amos.wang
 * @date 2021/2/7 10:31
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return this.getClass().getSimpleName() + " Say Hello!";
    }

}
