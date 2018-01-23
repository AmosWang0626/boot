package cn.amos.core.service;

import cn.amos.common.request.UserRequest;
import cn.amos.common.response.GeneralResponse;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/17
 */
public interface UserService {

    /**
     * 注册用户
     *
     * @param userRequest 用户表单
     * @return 通用
     */
    GeneralResponse generateUser(UserRequest userRequest);
}
