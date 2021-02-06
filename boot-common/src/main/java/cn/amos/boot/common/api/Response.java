package cn.amos.boot.common.api;

/**
 * DESCRIPTION: Response
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/6
 */
public class Response {

    /**
     * 状态码
     */
    final String code;
    /**
     * 状态码对应信息
     */
    final String msg;

    public Response(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
