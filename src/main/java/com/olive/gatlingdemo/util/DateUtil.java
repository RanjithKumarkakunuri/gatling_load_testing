package com.olive.gatlingdemo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {
//	public static XMLGregorianCalendar getDate() {
//		GregorianCalendar c = new GregorianCalendar();
//		c.setTime(new Date());
//		XMLGregorianCalendar date2 = null;
//		try {
//			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
//		} catch (DatatypeConfigurationException e) {
//			e.printStackTrace();
//		}
//		return date2;
//	}

	public static String getDateStringByString(String str, String srcFormat, String dstFormat) {
		try {
			Date date = getDateByString(str, srcFormat);
			DateFormat dateFormat = new SimpleDateFormat(dstFormat);
			return dateFormat.format(date);
		} catch (Exception e) {
			return str;
		}
	}
	public static Date getDateByTS(String ts) {
		Date date= getDateByString(ts, "yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		if(date==null) {
			date= getDateByString(ts, "yyyy-MM-dd'T'HH:mm:ssXXX");
		}
		return date;
	}
	
	public static String generaterrn() {
		Date d = new Date();
		String jd = getJulianDate(d, TimeZone.getTimeZone("IST"));
		String ist = getDateTime(d);
		String stan = String.valueOf(System.currentTimeMillis() % 1000000);
		return jd + ist.substring(4, 6) + StringUtil.padleft(stan + "", 6, '0');
	}
	
	public static Date getDateByString(String str, String format) {
		try {
			return new SimpleDateFormat(format).parse(str);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static XMLGregorianCalendar getDate() {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = null;
		try {
			String FORMATER = "yyyy-MM-dd'T'HH:mm:ssXXX";
			DateFormat format = new SimpleDateFormat(FORMATER);
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(new Date()));
		} catch (DatatypeConfigurationException e) {
//			e.printStackTrace();
		}
		return date2;
	}

	public static String getJulianDate(Date d, TimeZone timeZone) {
		String day = formatDate(d, "DDD", timeZone);
		String year = formatDate(d, "yy", timeZone);
		year = year.substring(1);
		return year + day;
	}

	public static String formatDate(Date d, String pattern, TimeZone timeZone) {
		SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateTimeInstance();
		df.setTimeZone(timeZone);
		df.applyPattern(pattern);
		return df.format(d);
	}

	public static String getDate(Date d) {
		return formatDate(d, "MMdd");
	}

	public static String formatDate(Date d, String pattern) {
		return formatDate(d, pattern, TimeZone.getDefault());
	}

	public static String getDateTime(Date d) {
		return formatDate(d, "MMddHHmmss");
	}

	/**
     * @param d date object to be formatted
     * @param timeZone for GMT for example, use TimeZone.getTimeZone("GMT")
     *       and for Uruguay use TimeZone.getTimeZone("GMT-03:00")
     * @return date in MMddHHmmss format suitable for FIeld 7
     */
    public static String getDateTime (Date d, TimeZone timeZone) {
        return formatDate (d, "MMddHHmmss", timeZone);
    }
    public static String getJulianDate(Date d) {
        String day = formatDate(d, "DDD", TimeZone.getDefault());
        String year = formatDate(d, "yy", TimeZone.getDefault());
        year = year.substring(1);
        return year + day;
      }
      
}
