package com.sunrain.exception;

/**
 * 
 * Title: DataExistException.java Description:
 *
 * @author sunrain
 * @date 2017年9月28日
 * @email dybarr@qq.com
 */
public class DataExistException extends SystemException {

	/** serialVersionUID*/
	private static final long serialVersionUID = 7017457255804124732L;

	public DataExistException(String message) {
		super(message);
	}

	public DataExistException(String message, Throwable cause) {
		super(message, cause);
	}
}
