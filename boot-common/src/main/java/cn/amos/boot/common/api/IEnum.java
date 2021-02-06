package cn.amos.boot.common.api;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
public interface IEnum {

    /**
     * 返回枚举字段name()
     *
     * @return 枚举字段值
     */
    String getKey();

    /**
     * 返回状态码
     *
     * @return 状态码
     */
    String getCode();

    /**
     * 返回状态码对应信息
     *
     * @return 状态码对应信息
     */
    String getMsg();
}
