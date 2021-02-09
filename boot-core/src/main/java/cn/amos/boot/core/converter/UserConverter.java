package cn.amos.boot.core.converter;

import cn.amos.boot.client.response.UserVO;
import cn.amos.boot.common.util.DateUtil;
import cn.amos.boot.dao.entity.UserEntity;

/**
 * DESCRIPTION: 对象转换工具
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/6
 */
public class UserConverter {

    public static UserVO toVo(UserEntity entity) {
        UserVO userVO = new UserVO();
        userVO.setId(entity.getId());
        userVO.setUsername(entity.getUsername());
        userVO.setAge(entity.getAge());
        userVO.setPhoneNo(entity.getPhoneNo());
        userVO.setAddress(entity.getAddress());
        userVO.setCreateTime(DateUtil.format(entity.getCreateTime(), DateUtil.BELONG_TIME_PATTERN));
        userVO.setUpdateTime(DateUtil.format(entity.getUpdateTime(), DateUtil.BELONG_TIME_PATTERN));

        return userVO;
    }

}
