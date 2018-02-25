package cn.amos.common.enums;

import cn.amos.common.response.IEnum;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 * @apiNote 订单状态
 */
public enum ApplyStatusEnum implements IEnum {
    /**
     * 订单状态
     */
    REPAYING("待缴费"),
    OVERDUE("逾期中"),
    SETTLE("已结清"),;

    private final String msg;

    ApplyStatusEnum(String msg) {
        this.msg = msg;
    }

    @Override
    public String getKey() {
        return this.name();
    }

    @Override
    public String getCode() {
        return this.name();
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
