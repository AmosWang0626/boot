package cn.amos.common.response;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
public enum GeneralEnum implements IEnum {
    // 系统通用返回码
    SUCCESS("1000", "成功"),
    FAIL("1001", "失败"),
    PARAM_ERROR("1002", "参数异常"),
    OTHER_ERROR("1003", "未知错误"),;

    /**
     * 状态码
     */
    private final String code;
    /**
     * 状态码对应信息
     */
    private final String msg;

    GeneralEnum(String code, String msg) {
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
