package cn.amos.boot.common;

import cn.amos.boot.common.request.UserRegisterRequest;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

public class BootCommonTests {

    @Test
    public void userGenerate() {
        for (int i = 10, len = 60; i < len; i++) {
            UserRegisterRequest userRegisterRequest = new UserRegisterRequest();
            userRegisterRequest.setUsername("hello" + i);
            userRegisterRequest.setAge(10 + i);
            userRegisterRequest.setPhoneNo("189123412" + i);
            userRegisterRequest.setAddress("上海市虹口区武进路" + i + "号");

            System.out.println(JSON.toJSONString(userRegisterRequest));
        }
    }

}
