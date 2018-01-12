package cn.amos.core.business.impl;

import cn.amos.core.business.HelloBusiness;
import org.springframework.stereotype.Component;

/**
 * PROJECT: boot
 * DATE: 2018/1/12
 *
 * @author DaoYuanWang
 */
@Component("helloBusiness")
public class HelloBusinessImpl implements HelloBusiness {

    @Override
    public String sayHello() {
        return this.getClass().getSimpleName() + " Say Hello!";
    }
}
