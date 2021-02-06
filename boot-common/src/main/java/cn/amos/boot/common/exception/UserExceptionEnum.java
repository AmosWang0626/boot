package cn.amos.boot.common.exception;


import cn.amos.boot.common.api.IEnum;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
public enum UserExceptionEnum implements IEnum {
    // 当前系统状态码
    PHONE_FORMAT_ERROR("U2000", "手机号格式错误"),
    PHONE_NO_EXIST("U2001", "您的手机号已注册"),
    PHONE_NO_REGISTERED("U2002", "您还未注册，请先注册"),
    OTHER_ERROR("U2003", "未知错误");

    /**
     * 错误码
     */
    private final String code;
    /**
     * 错误信息
     */
    private final String msg;

    UserExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getKey() {
        return this.name();
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
