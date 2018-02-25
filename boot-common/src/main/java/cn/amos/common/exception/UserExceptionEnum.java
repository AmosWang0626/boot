package cn.amos.common.exception;


import cn.amos.common.response.IEnum;

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
    OTHER_ERROR("U2003", "未知错误"),

    BAI_DU_ERROR_SYSTEM_UNAVAILABLE("E0001", "[百度]系统繁忙,请稍后重试"),
    BAI_DU_ERROR_TOKEN_NOT_EXIST("E0002", "[百度]用户Token异常,请检查输入"),
    BAI_DU_ERROR_PARAMETER("E0003", "[百度]参数错误,请检查输入"),
    BAI_DU_ERROR_OTHER("E0004", "[百度]未知错误[{0}]"),

    TAO_BAO_ERROR_OTHER("E0010", "[淘宝]参数错误[{0}]"),;

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
