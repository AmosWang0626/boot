package cn.amos.dao.mappers;

import cn.amos.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * PROJECT: boot
 * DATE: 2018/1/12
 *
 * @author DaoYuanWang
 */
@Repository
public interface UserMapper {

    /**
     * 获取用户信息
     *
     * @param id 用户编号
     * @return 用户实体
     */
    @Select("select * from user where id=#{id}")
    UserEntity selectById(Long id);

}
