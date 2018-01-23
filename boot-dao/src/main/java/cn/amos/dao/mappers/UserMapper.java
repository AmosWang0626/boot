package cn.amos.dao.mappers;

import cn.amos.common.page.PageModel;
import cn.amos.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PROJECT: first
 * DATE: 2018/1/14
 *
 * @author DaoYuanWang
 */
@Repository
public interface UserMapper {

    /**
     * 根据用户编号查询
     *
     * @param userId 用户编号
     * @return 用户实体
     */
    @Select("select * from user where USER_ID=#{userId}")
    UserEntity selectById(String userId);

    /**
     * 获取所有用户
     *
     * @return 所有用户信息
     */
    @Select("select * from user")
    List<UserEntity> selectAll();

    /**
     * 根据分页参数获取订单
     *
     * @param pageModel 分页参数
     * @return 指定订单
     */
    @Select("select * from user limit #{firstIndex}, #{rows}")
    List<UserEntity> selectByPage(PageModel pageModel);

    /**
     * 添加用户
     *
     * @param userEntity 用户信息
     * @return 通用
     */
    @Insert("INSERT INTO user " +
            "(USER_ID, NAME, AGE, PHONE_NO, ADDRESS, IDENTITY_NO, CREATE_TIME, UPDATE_TIME) " +
            "VALUES(#{userId}, #{name}, #{age}, #{phoneNo}, #{address}, #{identityNo}, #{createTime}, #{updateTime})")
    int insertUserEntity(UserEntity userEntity);
}
