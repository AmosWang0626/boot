package cn.amos.dao.mappers;

import cn.amos.common.page.PageModel;
import cn.amos.dao.entity.ApplyEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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
public interface ApplyMapper {

    /**
     * 通过订单号查询订单
     *
     * @param applyNo 订单编号
     * @return 订单
     */
    @Select("select * from apply where APPLY_NO=#{applyNo}")
    @Results({
            @Result(property = "applyNo", column = "APPLY_NO"),
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "applyAmt", column = "APPLY_AMT"),
            @Result(property = "applyTime", column = "APPLY_TIME"),
            @Result(property = "applyType", column = "APPLY_TYPE"),
            @Result(property = "applyStatus", column = "APPLY_STATUS"),
            @Result(property = "reason", column = "REASON")})
    ApplyEntity selectByApplyNo(String applyNo);

    /**
     * 获取所有订单
     *
     * @return 所有订单
     */
    @Select("select * from apply")
    List<ApplyEntity> selectAll();

    /**
     * 根据分页参数获取订单
     *
     * @param pageModel 分页参数
     * @return 指定订单
     */
    @Select("select * from apply limit #{firstIndex}, #{rows}")
    List<ApplyEntity> selectByPage(PageModel pageModel);

    /**
     * 插入一条数据
     *
     * @param applyEntity 类型
     * @return int
     */
    @Insert("INSERT INTO apply " +
            "(APPLY_NO, USER_ID, APPLY_AMT, APPLY_TIME, APPLY_TYPE, APPLY_STATUS, REASON, IP, CITY, LOCATION, CREATE_TIME, UPDATE_TIME) " +
            "VALUES(" +
            "#{applyNo}, #{userId}, #{applyAmt}, #{applyTime}, #{applyType}, #{applyStatus}, #{reason}, " +
            "#{ip}, #{city}, #{location}, #{createTime}, #{updateTime})")
    int insertApplyEntity(ApplyEntity applyEntity);

}
