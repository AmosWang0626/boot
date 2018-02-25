package cn.amos.common.request;

import cn.amos.common.enums.ApplyStatusEnum;
import cn.amos.common.enums.ApplyTypeEnum;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class ApplyRequest {
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 交易金额
     */
    private BigDecimal applyAmt;
    /**
     * 交易时间
     */
    private Date applyTime;
    /**
     * 交易类型
     */
    private ApplyTypeEnum applyType;
    /**
     * 交易状态
     */
    private ApplyStatusEnum applyStatus;
    /**
     * 交易备注
     */
    private String reason;
    /**
     * 交易ip
     */
    private String ip;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getApplyAmt() {
        return applyAmt;
    }

    public void setApplyAmt(BigDecimal applyAmt) {
        this.applyAmt = applyAmt;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public ApplyTypeEnum getApplyType() {
        return applyType;
    }

    public void setApplyType(ApplyTypeEnum applyType) {
        this.applyType = applyType;
    }

    public ApplyStatusEnum getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(ApplyStatusEnum applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
