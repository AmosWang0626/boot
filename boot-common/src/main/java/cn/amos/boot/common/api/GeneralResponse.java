package cn.amos.boot.common.api;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
public class GeneralResponse<T> extends Response implements Serializable {
    private static final long serialVersionUID = 1684229805068982996L;

    /**
     * Body
     */
    private T body;

    private GeneralResponse(IEnum iEnum) {
        super(iEnum.getCode(), iEnum.getMsg());
    }

    private GeneralResponse(IEnum iEnum, T body) {
        super(iEnum.getCode(), iEnum.getMsg());
        this.body = body;
    }

    private GeneralResponse(IEnum iEnum, String msg) {
        super(iEnum.getCode(), msg);
    }

    public static <T> GeneralResponse<T> ofSuccess() {
        return new GeneralResponse<>(GeneralEnum.SUCCESS);
    }

    public static <T> GeneralResponse<T> ofSuccess(T data) {
        return new GeneralResponse<>(GeneralEnum.SUCCESS, data);
    }

    public static <T> GeneralResponse<T> ofFail() {
        return ofFail(GeneralEnum.FAIL);
    }

    public static <T> GeneralResponse<T> ofFail(IEnum iEnum) {
        return new GeneralResponse<>(iEnum);
    }

    public static <T> GeneralResponse<T> ofFail(String message) {
        return new GeneralResponse<>(GeneralEnum.FAIL, message);
    }

    public static <T> GeneralResponse<T> ofFail(IEnum iEnum, String message) {
        return new GeneralResponse<>(iEnum, MessageFormat.format(iEnum.getMsg(), message));
    }

    public static <T> GeneralResponse<T> ofErrorParam(String message) {
        return new GeneralResponse<>(GeneralEnum.PARAM_ERROR, message);
    }

    public boolean success() {
        return GeneralEnum.SUCCESS.getCode().equals(getCode());
    }

    public T getBody() {
        return body;
    }
}
