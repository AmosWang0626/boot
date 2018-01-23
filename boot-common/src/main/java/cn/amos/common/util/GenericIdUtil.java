package cn.amos.common.util;

import java.util.Date;

/**
 * PROJECT: property
 * DATE: 2017/11/20
 *
 * @author DaoyuanWang
 */
public class GenericIdUtil {

    /**
     * 生成16位会员编号
     */
    public static String genericUserId() {
        StringBuffer sb = new StringBuffer();
        sb.append(DateUtil.format(new Date(), DateUtil.DEFAULT_DATE_PATTERN));
        sb.append("U");
        sb.append(RandomUtil.generateLuckyNumberString(7));

        return sb.toString();
    }

    /**
     * 生成20位订单编号
     */
    public static String genericApplyNo() {
        StringBuffer sb = new StringBuffer();
        sb.append(DateUtil.format(new Date(), DateUtil.MINUTE_DATE_PATTERN));
        sb.append("A");
        sb.append(RandomUtil.generateUpperString(7));

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("用户编号：" + genericUserId());
        System.out.println("订单编号：" + genericApplyNo());
    }
}
