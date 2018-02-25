package cn.amos.common.util;

/**
 * PROJECT: property
 * DATE: 2017/12/11
 *
 * @author DaoYuanWang
 */
public class EncryptUtil {

    public static String encryPhoneNo(String phoneNo) {
        return phoneNo.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }
}
