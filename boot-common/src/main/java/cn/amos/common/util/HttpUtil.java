package cn.amos.common.util;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class HttpUtil {

    private static final RestTemplate REST_TEMPLATE = new RestTemplate();

    public static String requestGetType(String url, Map<String, Object> uriVariables) {
        return REST_TEMPLATE.getForObject(url, String.class, uriVariables);
    }
}
