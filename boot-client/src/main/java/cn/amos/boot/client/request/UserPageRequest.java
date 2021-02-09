package cn.amos.boot.client.request;

import cn.amos.boot.common.api.page.Page;

import java.io.Serializable;

/**
 * boot
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class UserPageRequest extends Page implements Serializable {
    private static final long serialVersionUID = -2202227226880418869L;

    /**
     * 查询条件: 手机号
     */
    private String phoneNo;
    /**
     * 查询条件: 开始时间 YYYY-MM-DD
     */
    private String startTime;
    /**
     * 查询条件: 结束时间 YYYY-MM-DD
     */
    private String endTime;

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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
