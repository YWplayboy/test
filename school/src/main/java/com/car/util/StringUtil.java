package com.car.util;

/**
 * 字符串常用类
 * */
public class StringUtil {
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static Boolean isBlank(String str){
		if(null == str || str.isEmpty()) return true;
		return false;
	}
}
