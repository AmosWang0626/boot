package cn.amos.common.response;

import cn.amos.common.exception.UserExceptionEnum;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
public class GeneralResponse<T> implements Serializable {
    private static final long serialVersionUID = 1684229805068982996L;

    /**
     * 系统通用返回对象
     */
    public static final GeneralResponse SUCCESS = new GeneralResponse(GeneralEnum.SUCCESS);
    public static final GeneralResponse FAIL = new GeneralResponse(GeneralEnum.FAIL);
    public static final GeneralResponse PARAME_ERROR = new GeneralResponse(GeneralEnum.PARAM_ERROR);
    public static final GeneralResponse OTHER_ERROR = new GeneralResponse(GeneralEnum.OTHER_ERROR);

    /**
     * 状态码
     */
    private String code;
    /**
     * 状态码对应信息
     */
    private String msg;
    /**
     * Body
     */
    private T body;

    public GeneralResponse(T body) {
        this(GeneralEnum.SUCCESS, body);
    }

    private GeneralResponse(GeneralEnum iEnum, T body) {
        this.code = iEnum.getCode();
        this.msg = iEnum.getMsg();
        this.body = body;
    }

    public GeneralResponse(UserExceptionEnum iEnum, Object msg) {
        this.code = iEnum.getCode();
        this.msg = MessageFormat.format(iEnum.getMsg(), msg);
    }

    public GeneralResponse(IEnum iEnum) {
        this.code = iEnum.getCode();
        this.msg = iEnum.getMsg();
    }

    public boolean success() {
        return GeneralEnum.SUCCESS.getCode().equals(getCode());
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getBody() {
        return body;
    }
}
