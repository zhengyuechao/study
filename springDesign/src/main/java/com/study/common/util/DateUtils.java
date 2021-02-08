package com.study.common.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.function.LongPredicate;

import org.apache.commons.lang3.time.DateFormatUtils;
/**
 * 
* @ClassName: DateUtils 
* @Description: 日期工具类
* @Author z
* @DateTime 2020年3月12日 下午2:53:36
 */
public class DateUtils {

	public  final static String PUBLIC_YYYY = "yyyy";
	private final static String YYYY = "yyyy";

	private final static String MM = "MM";

	private final static String DD = "dd";
	/**
	 * The UTC time zone (often referred to as GMT). This is private as it is
	 * mutable.
	 */
	private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("GMT");
	/**
	 * ISO8601 formatter for date-time without time zone. The format used is
	 * <tt>yyyy-MM-dd'T'HH:mm:ss</tt>.
	 */
	public static final String ISO_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * ISO8601 formatter for date without time zone. The format used is
	 * <tt>yyyy-MM-dd</tt>.
	 */
	public static final String ISO_DATE_FORMAT = "yyyy-MM-dd";
	/**
	 * ISO8601-like formatter for time without time zone. The format used is
	 * <tt>HH:mm:ss</tt>. This pattern does not comply with the formal ISO8601
	 * specification as the standard requires the 'T' prefix for times.
	 */
	public static final String ISO_TIME_FORMAT = "HH:mm:ss";

	 

	/**
	 * 
	* @Title: getCurrentYYYY 
	* @Description:  获取当前年份
	* @Author z
	* @DateTime 2020年3月12日 下午2:43:50 
	* @return
	 */
	public static String getCurrentYYYY() {
		return DateFormatUtils.format(new Date(), YYYY);
	}

	/**
	 * 
	 * @Title: formatTime
	 * @Description: 格式化时分秒
	 * @Author z
	 * @DateTime 2020年3月12日 下午2:31:50
	 * @param d Date对象
	 * @return
	 */
	public static String formatTime(Date d) {
		return DateFormatUtils.format(d, ISO_TIME_FORMAT);
	}

	/**
	 * 
	 * @Title: formatDateTime
	 * @Description: 格式化年月日
	 * @Author z
	 * @DateTime 2020年3月12日 下午2:31:17
	 * @param d Date 对象
	 * @return
	 */
	public static String formatDateTime(Date d) {
		return DateFormatUtils.format(d, ISO_DATETIME_FORMAT);
	}

	/**
	 * 每天的毫秒数 8640000.
	 */
	public static final long MILLISECONDS_PER_DAY = 86400000L;

	/**
	 * 每周的天数.
	 */
	public static final long DAYS_PER_WEEK = 7L;

	/**
	 * 每小时毫秒数.
	 */
	public static final long MILLISECONDS_PER_HOUR = 3600000L;

	/**
	 * 每分钟秒数.
	 */
	public static final long SECONDS_PER_MINUTE = 60L;

	/**
	 * 每小时秒数.
	 */
	public static final long SECONDS_PER_HOUR = 3600L;

	/**
	 * 每天秒数.
	 */
	public static final long SECONDS_PER_DAY = 86400L;

	/**
	 * 每个月秒数，默认每月30天.
	 */
	public static final long SECONDS_PER_MONTH = 2592000L;

	/**
	 * 每年秒数，默认每年365天.
	 */
	public static final long SECONDS_PER_YEAR = 31536000L;

	/**
	 * 常用的时间格式.
	 */
	private static String[] parsePatterns = { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy/MM/dd",
			"yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm" };

	/**
	 * .
	 * 
	 * @return String 日期字符串，例如2015-08-11
	 * 
	 */
	
	/**
	 * 
	* @Title: getDate 
	* @Description: 得到当前日期字符串
	* @Author z
	* @DateTime 2020年3月12日 下午2:47:38 
	* @return String 日期字符串，例如2020-03-11
	 */
	public static String getDate() {
		return getDate(DateUtils.ISO_DATE_FORMAT);
	}

	/**  
	* @Title: getTime 
	* @Description: 得到当前时间字符串
	* @Author z
	* @DateTime 2020年3月12日 下午2:47:18 
	* @return  String 日期字符串，例如02:47:18
	 */
	public static String getTime() {
		return formatDate(new Date(), DateUtils.ISO_TIME_FORMAT);
	}
 
	
	/**
	 * 
	* @Title: getDateTime 得到当前日期和时间字符串
	* @Description: 
	* @Author z
	* @DateTime 2020年3月12日 下午2:50:28 
	* @return String 日期和时间字符串，例如 2020-03-11 02:50:28
	 */
	public static String getDateTime() {
		return formatDate(new Date(), DateUtils.ISO_DATETIME_FORMAT);
	}

	/**
	 * 获取当前时间指定格式下的字符串.
	 * 
	 * @param pattern 转化后时间展示的格式，例如"yyyy-MM-dd"，"yyyy-MM-dd HH:mm:ss"等
	 * @return String 格式转换之后的时间字符串.
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}

	/**
	 * 获取指定日期的字符串格式.
	 * 
	 * @param date    需要格式化的时间，不能为空
	 * @param pattern 时间格式，例如"yyyy-MM-dd"，"yyyy-MM-dd HH:mm:ss"等
	 * @return String 格式转换之后的时间字符串.
	 */
	public static String getDate(Date date, String pattern) {
		return DateFormatUtils.format(date, pattern);
	}

	/**
	 * 获取日期时间字符串，默认格式为（yyyy-MM-dd）.
	 * 
	 * @param date    需要转化的日期时间
	 * @param pattern 时间格式，例如"yyyy-MM-dd" "HH:mm:ss" "E"等
	 * @return String 格式转换后的时间字符串
	 * 
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if (pattern != null && pattern.length > 0) {
			formatDate = DateFormatUtils.format(date, pattern[0].toString());
		} else {
			formatDate = DateFormatUtils.format(date, DateUtils.ISO_DATE_FORMAT);
		}
		return formatDate;
	}

	/**
	 * 获取当前年份字符串.
	 * 
	 * @return String 当前年份字符串，例如 2015
	 * 
	 */
	public static String getYear() {
		return formatDate(new Date(), YYYY);
	}

	/**
	 * 获取当前月份字符串.
	 * 
	 * @return String 当前月份字符串，例如 08
	 * 
	 */
	public static String getMonth() {
		return formatDate(new Date(), MM);
	}

	/**
	 * 获取当前天数字符串.
	 * 
	 * @return String 当前天数字符串，例如 11
	 * 
	 */
	public static String getDay() {
		return formatDate(new Date(), DD);
	}

	/**
	 * 获取当前星期字符串.
	 * 
	 * @return String 当前星期字符串，例如星期二
	 * 
	 */
	public static String getWeek() {
		return formatDate(new Date(), "E");
	}

	/**
	 * 将日期型字符串转换为日期格式. 支持的日期字符串格式包括"yyyy-MM-dd","yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd
	 * HH:mm", "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm"
	 * 
	 * @param str
	 * @return Date
	 * 
	 */
	public static Date parseDate(Object str) {
		if (str == null) {
			return null;
		}
		try {
			return org.apache.commons.lang3.time.DateUtils.parseDate(str.toString(), parsePatterns);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 获取当前日期与指定日期相隔的天数.
	 * 
	 * @param date 给定的日期
	 * @return long 日期间隔天数，正数表示给定日期在当前日期之前，负数表示在当前日期之后
	 * 
	 */
	public static long pastDays(Date date) {
		// 将指定日期转换为yyyy-MM-dd格式
		date = DateUtils.parseDate(DateUtils.formatDate(date, DateUtils.ISO_DATE_FORMAT));
		// 当前日期转换为yyyy-MM-dd格式
		Date currentDate = DateUtils.parseDate(DateUtils.formatDate(new Date(), DateUtils.ISO_DATE_FORMAT));
		long t = 0;
		if (date != null && currentDate != null) {
			t = (currentDate.getTime() - date.getTime()) / DateUtils.MILLISECONDS_PER_DAY;
		}
		return t;
	}

	/**
	 * 获取当前日期指定天数之后的日期.
	 * 
	 * @param num 相隔天数
	 * @return Date 日期
	 * 
	 */
	public static Date nextDay(int num) {
		Calendar curr = Calendar.getInstance();
		curr.set(Calendar.DAY_OF_MONTH, curr.get(Calendar.DAY_OF_MONTH) + num);
		return curr.getTime();
	}

	/**
	 * 获取当前日期指定月数之后的日期.
	 * 
	 * @param num 间隔月数
	 * @return Date 日期
	 * 
	 */
	public static Date nextMonth(int num) {
		Calendar curr = Calendar.getInstance();
		curr.set(Calendar.MONTH, curr.get(Calendar.MONTH) + num);
		return curr.getTime();
	}

	/**
	 * 获取当前日期指定年数之后的日期.
	 * 
	 * @param num 间隔年数
	 * @return Date 日期
	 * 
	 */
	public static Date nextYear(int num) {
		Calendar curr = Calendar.getInstance();
		curr.set(Calendar.YEAR, curr.get(Calendar.YEAR) + num);
		return curr.getTime();
	}

	/**
	 * 将 Date 日期转化为 Calendar 类型日期.
	 * 
	 * @param date 给定的时间，若为null，则默认为当前时间
	 * @return Calendar Calendar对象
	 * 
	 */
	public static Calendar getCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		// calendar.setFirstDayOfWeek(Calendar.SUNDAY);//每周从周日开始
		// calendar.setMinimalDaysInFirstWeek(1); // 设置每周最少为1天
		if (date != null) {
			calendar.setTime(date);
		}
		return calendar;
	}

	/**
	 * 计算两个日期之间相差天数.
	 * 
	 * @param start 计算开始日期
	 * @param end   计算结束日期
	 * @return long 相隔天数
	 * 
	 */
	public static long getDaysBetween(Date start, Date end) {
		// 将指定日期转换为yyyy-MM-dd格式
		start = DateUtils.parseDate(DateUtils.formatDate(start, DateUtils.ISO_DATE_FORMAT));
		// 当前日期转换为yyyy-MM-dd格式
		end = DateUtils.parseDate(DateUtils.formatDate(end, DateUtils.ISO_DATE_FORMAT));

		long diff = 0;
		if (start != null && end != null) {
			diff = (end.getTime() - start.getTime()) / DateUtils.MILLISECONDS_PER_DAY;
		}
		return diff;
	}

	/**
	 * 计算两个日期之前相隔多少周.
	 * 
	 * @param start 计算开始时间
	 * @param end   计算结束时间
	 * @return long 相隔周数，向下取整
	 * 
	 */
	public static long getWeeksBetween(Date start, Date end) {
		return getDaysBetween(start, end) / DateUtils.DAYS_PER_WEEK;
	}

	/**
	 * 获取与指定日期间隔给定天数的日期.
	 * 
	 * @param specifiedDay 给定的字符串格式日期，支持的日期字符串格式包括"yyyy-MM-dd","yyyy-MM-dd
	 *                     HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy/MM/dd", "yyyy/MM/dd
	 *                     HH:mm:ss", "yyyy/MM/dd HH:mm"
	 * @param num          间隔天数
	 * @return String 间隔指定天数之后的日期
	 * 
	 */
	public static String getSpecifiedDayAfter(String specifiedDay, int num) {
		Date specifiedDate = parseDate(specifiedDay);
		Calendar c = Calendar.getInstance();
		c.setTime(specifiedDate);
		int day = c.get(Calendar.DATE);
		c.set(Calendar.DATE, day + num);
		String dayAfter = formatDate(c.getTime(), DateUtils.ISO_DATE_FORMAT);
		return dayAfter;
	}

	/**
	 * 计算两个日期之前间隔的小时数.
	 * 
	 * @param date1 结束时间
	 * @param date2 开始时间
	 * @return String 相差的小时数，保留一位小数
	 * 
	 */
	public static String dateMinus(Date date1, Date date2) {
		if (date1 == null || date2 == null) {
			return "0";
		}
		Long r = date1.getTime() - date2.getTime();
		DecimalFormat df = new DecimalFormat("#.0");
		double result = r * 1.0 / DateUtils.MILLISECONDS_PER_HOUR;
		return df.format(result);
	}

	/**
	 * 获取当前季度 .
	 * 
	 * @return Integer 当前季度数
	 * 
	 */
	public static Integer getCurrentSeason() {
		Calendar calendar = Calendar.getInstance();
		Integer month = calendar.get(Calendar.MONTH) + 1;
		int season = 0;
		if (month >= 1 && month <= 3) {
			season = 1;
		} else if (month >= 4 && month <= 6) {
			season = 2;
		} else if (month >= 7 && month <= 9) {
			season = 3;
		} else if (month >= 10 && month <= 12) {
			season = 4;
		}
		return season;
	}

	/**
	 * 将以秒为单位的时间转换为其他单位.
	 * 
	 * @param seconds 秒数
	 * @return String 例如 16分钟前、2小时前、3天前、4月前、5年前等
	 * 
	 */
	public static String getIntervalBySeconds(long seconds) {
		StringBuffer buffer = new StringBuffer();
		if (seconds < SECONDS_PER_MINUTE) {
			buffer.append(seconds).append("秒前");
		} else if (seconds < SECONDS_PER_HOUR) {
			buffer.append(seconds / SECONDS_PER_MINUTE).append("分钟前");
		} else if (seconds < SECONDS_PER_DAY) {
			buffer.append(seconds / SECONDS_PER_HOUR).append("小时前");
		} else if (seconds < SECONDS_PER_MONTH) {
			buffer.append(seconds / SECONDS_PER_DAY).append("天前");
		} else if (seconds < SECONDS_PER_YEAR) {
			buffer.append(seconds / SECONDS_PER_MONTH).append("月前");
		} else {
			buffer.append(seconds / DateUtils.SECONDS_PER_YEAR).append("年前");
		}
		return buffer.toString();
	}

	/**
	 * 
	 * getNowTimeBefore(记录时间相当于目前多久之前)
	 * 
	 * @param seconds 秒
	 * @return
	 * @exception 
	 * 
	 */
	public static String getNowTimeBefore(long seconds) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("上传于");
		if (seconds < 3600) {
			buffer.append((long) Math.floor(seconds / 60.0)).append("分钟前");
		} else if (seconds < 86400) {
			buffer.append((long) Math.floor(seconds / 3600.0)).append("小时前");
		} else if (seconds < 604800) {
			buffer.append((long) Math.floor(seconds / 86400.0)).append("天前");
		} else if (seconds < 2592000) {
			buffer.append((long) Math.floor(seconds / 604800.0)).append("周前");
		} else if (seconds < 31104000) {
			buffer.append((long) Math.floor(seconds / 2592000.0)).append("月前");
		} else {
			buffer.append((long) Math.floor(seconds / 31104000.0)).append("年前");
		}
		return buffer.toString();
	}

	/**
	 * 
	 * getMonthsBetween(查询两个日期相隔的月份)
	 * 
	 * @param startDate 开始日期1 (格式yyyy-MM-dd)
	 * @param endDate   截止日期2 (格式yyyy-MM-dd)
	 * @return
	 */
	public static int getMonthsBetween(String startDate, String endDate) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(DateUtils.parseDate(startDate));
		c2.setTime(DateUtils.parseDate(endDate));
		int year = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
		int month = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
		return Math.abs(year * 12 + month);
	}

	/**
	 * 
	 * getDayOfWeek(获取当前日期是星期几)
	 * 
	 * @param dateStr 日期
	 * @return 星期几
	 */
	public static String getDayOfWeek(String dateStr) {
		String[] weekOfDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Date date = parseDate(dateStr);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int num = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		return weekOfDays[num];
	}

	/**
	 * sns 格式 如几秒前，几分钟前，几小时前，几天前，几个月前，几年后， ... 精细，类如某个明星几秒钟之前发表了一篇微博
	 * 
	 * @param createTime
	 * @return
	 */
	public static String snsFormat(long createTime) {
		long now = System.currentTimeMillis() / 1000;
		long differ = now - createTime / 1000;
		String dateStr = "";
		if (differ <= 60) {
			dateStr = "刚刚";
		} else if (differ <= 3600) {
			dateStr = (differ / 60) + "分钟前";
		} else if (differ <= 3600 * 24) {
			dateStr = (differ / 3600) + "小时前";
		} else if (differ <= 3600 * 24 * 30) {
			dateStr = (differ / (3600 * 24)) + "天前";
		} else {
			Date date = new Date(createTime);
			SimpleDateFormat sdf = new SimpleDateFormat(ISO_DATE_FORMAT);
			dateStr = sdf.format(date);
		}
		return dateStr;
	}

	/**
	 * 得到UTC时间，类型为字符串，格式为"yyyy-MM-dd HH:mm" 如果获取失败，返回null
	 * 
	 * @return
	 */
	public static String getUTCTimeStr() {
		StringBuffer UTCTimeBuffer = new StringBuffer();
		// 1、取得本地时间：
		Calendar cal = Calendar.getInstance();
		// 2、取得时间偏移量：
		int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
		// 3、取得夏令时差：
		int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
		// 4、从本地时间里扣除这些差量，即可以取得UTC时间：
		cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		UTCTimeBuffer.append(year).append("-").append(month).append("-").append(day);
		UTCTimeBuffer.append(" ").append(hour).append(":").append(minute);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			sdf.parse(UTCTimeBuffer.toString());
			return UTCTimeBuffer.toString();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
    /**  
     * @Description: String类型毫秒数转换成日期        
     *  lo 毫秒数 
     * @return String yyyy-MM-dd HH:mm:ss    
     */    
     public static String stringToDate(String lo){
       long time = Long.parseLong(lo);
       Date date = new Date(time);
       SimpleDateFormat sd = new SimpleDateFormat(ISO_DATETIME_FORMAT);
       return sd.format(date);
     }
     
     /**
      * @Description: long类型转换成日期
      *
      * @param lo 毫秒数
      * @return String yyyy-MM-dd HH:mm:ss
      */
     public static String longToDate(long lo){
         Date date = new Date(lo);
         SimpleDateFormat sd = new SimpleDateFormat(ISO_DATETIME_FORMAT);
         return sd.format(date);
     }
     
     
     
     public static int differentDays(Date date1,Date date2)
     {
    	 try {
    		 Calendar cal1 = Calendar.getInstance();
             cal1.setTime(date1);
             
             Calendar cal2 = Calendar.getInstance();
             cal2.setTime(date2);
            int day1= cal1.get(Calendar.DAY_OF_YEAR);
             int day2 = cal2.get(Calendar.DAY_OF_YEAR);
             
             int year1 = cal1.get(Calendar.YEAR);
             int year2 = cal2.get(Calendar.YEAR);
             if(year1 != year2)   //同一年
             {
                 int timeDistance = 0 ;
                 for(int i = year1 ; i < year2 ; i ++)
                 {
                     if(i%4==0 && i%100!=0 || i%400==0)    //闰年            
                     {
                         timeDistance += 366;
                     }
                     else    //不是闰年
                     {
                         timeDistance += 365;
                     }
                 }
                 
                 return timeDistance + (day2-day1) ;
             }
             else    //不同年
             {
                 System.out.println("判断day2 - day1 : " + (day2-day1));
                 return day2-day1;
             }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
         
     }
     
	/**
	 * 
	* @Title: differentDaysNew 
	* @Description: 两个日期相减的日期差(最正确的操作)
	* @Author z
	* @DateTime 2020年4月16日 上午8:27:06 
	* @param date1
	* @param date2
	* @return
	 */
	public static int differentDaysNew(Date date1, Date date2) {
		if (date1 == null || date2 == null) {
			throw new RuntimeException("日期不能为空");
		}
		LocalDate localDate1 = date2LocalDate(date1);
		LocalDate localDate2 = date2LocalDate(date2);
		//return Generic.long2int(localDate1.until(localDate2, ChronoUnit.DAYS));
		long lday = localDate1.until(localDate2, ChronoUnit.DAYS);
		return  (int)lday;
	}
	 

     public static LocalDate date2LocalDate(Date date) {
         Instant instant = date.toInstant();
         ZoneId zoneId = ZoneId.systemDefault();
         LocalDate localDate = instant.atZone(zoneId).toLocalDate();
         return localDate;
     }
     
     public static void main(String[] args) {
    	 Date d1 = parseDate("2020-1-1");
    	 Date d2 = parseDate("2019-12-25");
    	 int d =differentDaysNew(d1,d2);
    	 System.out.println(d);
	}


}
