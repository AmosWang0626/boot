package cn.amos.boot.common.util;

import java.util.UUID;

/**
 * DESCRIPTION: IdUtil
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/6
 */
public class IdUtil {

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

}
