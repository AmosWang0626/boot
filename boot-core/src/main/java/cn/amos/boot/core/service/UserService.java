package cn.amos.boot.core.service;

import cn.amos.boot.common.api.Response;
import cn.amos.boot.common.api.page.Page;
import cn.amos.boot.common.api.page.PageResult;
import cn.amos.boot.client.request.UserRegisterRequest;
import cn.amos.boot.client.response.UserVO;

/**
 * boot
 *
 * @author DaoYuanWang
 * @date 2018/1/17
 */
public interface UserService {

    /**
     * 注册用户
     *
     * @param userRegisterRequest 用户表单
     * @return 结果
     */
    Response generateUser(UserRegisterRequest userRegisterRequest);

    /**
     * 分页查询
     *
     * @param page 条件
     * @return 结果
     */
    PageResult<UserVO> findByPage(Page page);
}
