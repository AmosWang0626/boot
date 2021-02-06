package cn.amos.boot.core.service.impl;

import cn.amos.boot.common.api.GeneralResponse;
import cn.amos.boot.common.api.Response;
import cn.amos.boot.common.api.page.Page;
import cn.amos.boot.common.api.page.PageResult;
import cn.amos.boot.common.request.UserRegisterRequest;
import cn.amos.boot.common.response.UserVO;
import cn.amos.boot.core.converter.UserConverter;
import cn.amos.boot.core.service.UserService;
import cn.amos.boot.dao.entity.UserEntity;
import cn.amos.boot.dao.mappers.UserMapper;
import cn.amos.boot.dao.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * boot
 *
 * @author DaoYuanWang
 * @date 2018/1/17
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserRepository userRepository;

    @Override
    public Response generateUser(UserRegisterRequest userRegisterRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userRegisterRequest.getUsername());
        userEntity.setAge(userRegisterRequest.getAge());
        userEntity.setPhoneNo(userRegisterRequest.getPhoneNo());
        userEntity.setAddress(userRegisterRequest.getAddress());
        userEntity.setCreateTime(new Date());
        userRepository.save(userEntity);

        return GeneralResponse.ofSuccess();
    }

    @Override
    public PageResult<UserVO> findByPage(Page page) {
        List<UserEntity> entities = userMapper.findByPage(page);
        int total = userMapper.totalByPage();

        List<UserVO> voList = entities.stream().map(UserConverter::toVo).collect(Collectors.toList());

        PageResult<UserVO> pageResult = new PageResult<>();
        // 总记录数量 || 当前页记录数量 || 记录数据列表
        pageResult.setTotal(total);
        pageResult.setNumber(entities.size());
        pageResult.setRows(voList);
        pageResult.finish(page.getPage(), page.getSize());

        return pageResult;
    }
}
