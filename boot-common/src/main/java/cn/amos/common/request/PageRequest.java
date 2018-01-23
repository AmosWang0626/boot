package cn.amos.common.request;

import java.io.Serializable;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class PageRequest implements Serializable {
    private static final long serialVersionUID = -2202227226880418869L;

    /**
     * 查询条件: 开始时间 YYYY-MM-DD
     */
    private String startTime;
    /**
     * 查询条件: 结束时间 YYYY-MM-DD
     */
    private String endTime;
    /**
     * 查询条件: 订单编号
     */
    private String applyNo;
    /**
     * 查询条件: 手机号
     */
    private String phoneNo;

    /**
     * 分页相关: 页码
     */
    private Integer page;
    /**
     * 分页相关: 当页显示数量
     */
    private Integer size;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
