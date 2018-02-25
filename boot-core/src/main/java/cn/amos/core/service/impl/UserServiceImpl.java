package cn.amos.core.service.impl;

import cn.amos.common.request.UserRequest;
import cn.amos.common.response.GeneralResponse;
import cn.amos.common.util.GenericIdUtil;
import cn.amos.core.service.UserService;
import cn.amos.dao.entity.UserEntity;
import cn.amos.dao.mappers.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/17
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public GeneralResponse generateUser(UserRequest userRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(GenericIdUtil.genericUserId());
        userEntity.setName(userRequest.getName());
        userEntity.setAge(userRequest.getAge());
        userEntity.setPhoneNo(userRequest.getPhoneNo());
        userEntity.setAddress(userRequest.getAddress());
        userEntity.setIdentityNo(userRequest.getIdentityNo());
        userEntity.setCreateTime(new Date());
        userMapper.insertUserEntity(userEntity);

        return GeneralResponse.SUCCESS;
    }
}
