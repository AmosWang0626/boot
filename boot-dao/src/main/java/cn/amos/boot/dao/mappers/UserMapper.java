package cn.amos.boot.dao.mappers;

import cn.amos.boot.common.api.page.Page;
import cn.amos.boot.dao.entity.UserEntity;
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
     * 获取所有用户
     *
     * @return 所有用户信息
     */
    @Select("select count(*) from org_user")
    int totalByPage();

    /**
     * 根据分页参数获取订单
     *
     * @param page 分页参数
     * @return 指定订单
     */
    @Select("select * from org_user limit #{firstIndex}, #{size}")
    List<UserEntity> findByPage(Page page);

}
