package cn.amos.boot.web;

import cn.amos.boot.client.request.UserRegisterRequest;
import cn.amos.boot.core.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@ComponentScan("cn.amos.boot")
@SpringBootTest
public class BootApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void userGenerate() {
        for (int i = 10, len = 60; i < len; i++) {
            UserRegisterRequest userRegisterRequest = new UserRegisterRequest();
            userRegisterRequest.setUsername("hello" + i);
            userRegisterRequest.setAge(10 + i);
            userRegisterRequest.setPhoneNo("189123412" + i);
            userRegisterRequest.setAddress("上海市虹口区武进路" + i + "号");
            System.out.println(userService.generateUser(userRegisterRequest));
        }
    }

}
