package cn.amos.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 *
 * @author DaoyuanWang
 */
public class DateUtil {

    public static final String DEFAULT_TIME_PATTERN = "yyyy/MM/dd HH:mm:ss";
    public static final String BELONG_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String SECOND_DATE_PATTERN = "yyyyMMddHHmmss";
    public static final String MINUTE_DATE_PATTERN = "yyyyMMddHHmm";
    public static final String MILLISECOND_PATTERN = "yyyyMMddHHmmssSSS";
    public static final String DEFAULT_DATE_PATTERN = "yyyyMMdd";
    public static final String BELONG_DATE_PATTERN = "yyyy-MM-dd";
    public static final String TIME_END = " 23:59:59";
    public static final String TIME_BEGIN = " 00:00:00";
    public static final String MONTH_PATTERN = "MMddHHmmss";

    /**
     * 格式化时间
     */
    public static String format(Date date, String pattern) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * 格式化时间字符串 yyyy-MM-dd HH:mm:ss
     */
    public static String formatBelongTimePattern(Date date) {
        return format(date, BELONG_TIME_PATTERN);
    }

    /**
     * 格式化时间字符串 yyyyMMddHHmmssSSS
     */
    public static String formatMilliseCodePattern(Date date) {
        return format(date, MILLISECOND_PATTERN);
    }

    /**
     * 格式化时间字符串 yyyyMMddHHmmss
     */
    public static String formatMilliseDatePattern(Date date) {
        return format(date, SECOND_DATE_PATTERN);
    }

    /**
     * 解析时间
     */
    public static Date parse(String date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 在当前日期上面增加分钟数
     */
    public static Date addMinutes(int amount) {
        return addMinutes(new Date(), amount);
    }

    /**
     * 在当前日期上面增加分钟数
     */
    public static Date addMinutes(Date date, int amount) {
        if (date == null) {
            date = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, amount);
        return calendar.getTime();
    }

    /**
     * 解析时间
     */
    public static Date parse(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(simpleDateFormat.format(date));
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 在当前日期上面增加天数
     */
    public static Date addDay(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    /**
     * 在当前日期上面加/减月数
     *
     * @param month 需要加/减的月数,减月份传负数
     * @return 日期
     */
    public static Date addMonth(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    /**
     * 指定日期上面加/减月数
     *
     * @param date  指定日期
     * @param month 需要加/减的月数,减月份传负数
     * @return 日期
     */
    public static Date addMonth(Date date, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    /**
     * 获取当前日期最后一秒
     *
     * @param date 日期
     * @return 日期
     */
    public static Date getEndTimeOfDay(Date date) {
        String dateStr = format(date, BELONG_DATE_PATTERN) + " " + TIME_END;
        return parse(dateStr, BELONG_TIME_PATTERN);
    }

    /**
     * 获取当前日期开始
     *
     * @param date 日期
     * @return 日期
     */
    public static Date getBeginTimeOfDay(Date date) {
        String dateStr = format(date, BELONG_DATE_PATTERN) + " " + TIME_BEGIN;
        return parse(dateStr, BELONG_TIME_PATTERN);
    }

    /**
     * 计算两个日期之间相差的天数
     * bdate - smdate 参数2 减 参数1 得到相差天数
     *
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差天数
     */
    public static int daysBetween(Date smdate, Date bdate) {
        SimpleDateFormat sdf = new SimpleDateFormat(BELONG_DATE_PATTERN);
        try {
            smdate = sdf.parse(sdf.format(smdate));
            bdate = sdf.parse(sdf.format(bdate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long betweenDays = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(betweenDays));
    }

    public static Date getDateFromTime(Date dateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateTime);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 给指定日期增加天数
     *
     * @param date 指定日期 @see Date
     * @param days 增加的天数
     * @return 增加天数后的日期
     */
    public static Date addDays(final Date date, int days) {
        if (days == 0) {
            return date;
        }
        if (date == null) {
            return null;
        }
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, days);
        return cal.getTime();
    }

    /**
     * 返回两个时间间隔的月数
     *
     * @param begin 起始时间 @see Date
     * @param end   终止时间 @see Date
     * @return 间隔的月份数，如果<code>begin</code>或者<code>end</code>为<code>null</code> ，返回 <code>-1</code>
     */
    public static int monthsBetween(final Date begin, final Date end) {
        if (begin == null || end == null) {
            return -1;
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(begin);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(end);
        return (cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR)) * 12
                + (cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH));
    }

    /**
     * 计算两个日期之间相差的小时数
     * bigDate - miniDate 得到相差小时数
     *
     * @param miniDate 较小的时间
     * @param bigDate  较大的时间
     * @return 相差小时数
     */
    private static int hoursBetween(Date miniDate, Date bigDate) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateUtil.BELONG_TIME_PATTERN);
        try {
            miniDate = sdf.parse(sdf.format(miniDate));
            bigDate = sdf.parse(sdf.format(bigDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(miniDate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bigDate);
        long time2 = cal.getTimeInMillis();
        long betweenHours = (time2 - time1) / (1000 * 3600);

        return Integer.parseInt(String.valueOf(betweenHours));
    }

    /**
     * 对于还款计划的日期设定，日期 A 和 日期 B 是否是同一天
     * 如1月31 和 4月30，返回true
     *
     * @param paramA 较早时间
     * @param paramB 较晚时间
     * @return 是不是同一天
     */
    public static Boolean isSameDateInPlan(Date paramA, Date paramB) {
        if (paramA.after(paramB)) {
            return false;
        }
        if (isSameDay(paramA, paramB)) {
            return true;
        }
        Date addedMonth = paramA;
        //防止内存溢出，月数间隔大于120  直接返回false
        int count = 1;
        while (true) {
            if (count > 120) {
                return false;
            }
            if (isSameDay(addedMonth, paramB)) {
                return true;
            } else if (addedMonth.after(paramB)) {
                return false;
            }
            addedMonth = addMonth(paramA, count);
            count++;
        }
    }

    /**
     * 判断两个日期对象是否具有相同的日
     *
     * @param date1 第一个日期对象 @see Date
     * @param date2 第二个日期对象 @see Date
     * @return 如果两个日期对象具有相同的日，返回 <code>true</code>
     */
    public static boolean isSameDay(Date date1, Date date2) {
        if (date1 == null && date2 == null) {
            return true;
        }
        if (date1 == null || date2 == null) {
            return false;
        }
        Calendar cal1 = GregorianCalendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = GregorianCalendar.getInstance();
        cal2.setTime(date2);
        return (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR))
                && (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && (cal1.get(Calendar.DATE) == cal2
                .get(Calendar.DATE)));
    }

    /**
     * 判断两个日期对象是否具有相同的月份
     *
     * @param date1 第一个日期对象 @see Date
     * @param date2 第二个日期对象 @see Date
     * @return 如果两个日期对象具有相同的月份，返回 <code>true</code>
     */
    public static boolean isSameMonth(Date date1, Date date2) {
        if (date1 == null && date2 == null) {
            return true;
        }
        if (date1 == null || date2 == null) {
            return false;
        }
        Calendar cal1 = GregorianCalendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = GregorianCalendar.getInstance();
        cal2.setTime(date2);
        return isSameMonth(cal1, cal2);
    }

    /**
     * 判断两个日历对象是否具有相同的月份
     *
     * @param cal1 第一个日期对象 @see Calendar
     * @param cal2 第二个日期对象 @see Calendar
     * @return 如果两个日历对象具有相同的月份，返回 <code>true</code>
     */
    public static boolean isSameMonth(Calendar cal1, Calendar cal2) {
        if (cal1 == null && cal2 == null) {
            return true;
        }
        if (cal1 == null || cal2 == null) {
            return false;
        }
        return (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR))
                && (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH));
    }
}
