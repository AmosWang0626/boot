package cn.amos.dao.mappers;

import cn.amos.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * PROJECT: boot
 * DATE: 2018/1/12
 *
 * @author DaoYuanWang
 */
@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    UserEntity selectById(Long id);

}
