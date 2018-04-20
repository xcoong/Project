package com.atguigu.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateUtil {


	public static Date getMyDate(long i) {
		// 关于日期的计算
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		return c.getTime();
	
	}

	public static String getMyTime(String format) {
		//关于日期格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(new Date());
		
		return str;
	}

}
