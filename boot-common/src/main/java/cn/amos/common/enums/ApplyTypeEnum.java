package cn.amos.common.enums;

import cn.amos.common.response.IEnum;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 * @apiNote 交易类型
 */
public enum ApplyTypeEnum implements IEnum {
    /**
     * 交易类型
     */
    PROPERTY("物业费"),
    WATER("水费"),
    ELECTRICITY("电费"),
    NETWORK("网络缴费"),;

    private final String msg;

    ApplyTypeEnum(String msg) {
        this.msg = msg;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMsg() {
        return null;
    }
}
