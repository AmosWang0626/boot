package cn.amos.common.util;

import cn.amos.common.dto.BaiDuLocationDTO;
import cn.amos.common.dto.BaiDuLocationErrorDTO;
import cn.amos.common.dto.TaoBaoLocationDTO;
import cn.amos.common.exception.UserExceptionEnum;
import cn.amos.common.response.GeneralResponse;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class IpUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(IpUtil.class);

    /**
     * 百度访问token
     */
    private static final String ACCESS_TOKEN = "23.8c3b9a489ff5f9b276ae49a54166fecc.2592000.1518836471.2307466515-10709969";

    /**
     * 根据ip获取位置【百度】
     *
     * @param ip ip
     * @return BaiDuLocationDTO
     */
    public static GeneralResponse<BaiDuLocationDTO> getLocationByBaiDu(String ip) {
        String url = "https://openapi.baidu.com/rest/2.0/iplib/query?access_token={access_token}&ip={ip}";
        Map<String, Object> uriVariables = new HashMap<>(2);
        try {
            uriVariables.put("access_token", URLEncoder.encode(ACCESS_TOKEN, "utf-8"));
            uriVariables.put("ip", URLEncoder.encode(ip, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            return GeneralResponse.FAIL;
        }
        String result = HttpUtil.requestGetType(url, uriVariables);
        BaiDuLocationDTO successObject = JSON.parseObject(result).getObject(ip, BaiDuLocationDTO.class);
        if (successObject == null) {
            BaiDuLocationErrorDTO object = JSON.parseObject(result, BaiDuLocationErrorDTO.class);
            if ("110".equals(object.getErrorCode())) {
                return new GeneralResponse<>(UserExceptionEnum.BAI_DU_ERROR_TOKEN_NOT_EXIST);
            } else if ("100".equals(object.getErrorCode())) {
                return new GeneralResponse<>(UserExceptionEnum.BAI_DU_ERROR_PARAMETER, object.getErrorMsg());
            } else if ("2".equals(object.getErrorCode())) {
                return new GeneralResponse<>(UserExceptionEnum.BAI_DU_ERROR_SYSTEM_UNAVAILABLE);
            } else {
                return new GeneralResponse<>(UserExceptionEnum.BAI_DU_ERROR_OTHER, object.getErrorMsg());
            }
        }
        return new GeneralResponse<>(successObject);
    }

    public static GeneralResponse<TaoBaoLocationDTO> getLocationByTaoBao(String ip) {
        String url = "http://ip.taobao.com/service/getIpInfo.php?ip={ip}";
        Map<String, Object> uriVariables = new HashMap<>(2);
        try {
            uriVariables.put("ip", URLEncoder.encode(ip, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            return GeneralResponse.FAIL;
        }
        String result = HttpUtil.requestGetType(url, uriVariables);
        String objectCode = JSON.parseObject(result).getObject("code", String.class);
        if ("0".equals(objectCode)) {
            TaoBaoLocationDTO successObject = JSON.parseObject(result).getObject("data", TaoBaoLocationDTO.class);
            return new GeneralResponse<>(successObject);
        }
        return new GeneralResponse<>(UserExceptionEnum.TAO_BAO_ERROR_OTHER, JSON.parseObject(result).getObject("data", String.class));
    }

    public static void main(String[] args) {
        // 上海
        // GeneralResponse<TaoBaoLocationDTO> location = getLocationByTaoBao("116.226.62.229");
        // 武汉
        // GeneralResponse<TaoBaoLocationDTO> location = getLocationByTaoBao("113.57.246.85");
        // 太原
        // GeneralResponse<TaoBaoLocationDTO> location = getLocationByTaoBao("223.14.95.76");
        // 洛阳
        GeneralResponse<TaoBaoLocationDTO> location = getLocationByTaoBao("115.63.163.155");
        if (location.success()) {
            LOGGER.info(location.getBody().toString());
        }
    }
}
