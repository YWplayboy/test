package com.car.exception;

/**
 * 数据库访问异常
 */
public class DBException extends Exception {
	public DBException(String msg){
		super(msg);
	}
}
