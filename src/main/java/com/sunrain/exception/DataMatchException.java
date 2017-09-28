package com.sunrain.exception;

/**
 * 
 * Title: DataMatchException.java Description:
 *
 * @author sunrain
 * @date 2017年9月28日
 * @email dybarr@qq.com
 */
public class DataMatchException extends SystemException {
	/** serialVersionUID*/
	private static final long serialVersionUID = -2980896681677871371L;

	public DataMatchException(String message) {
		super(message);
	}

	public DataMatchException(String message, Throwable cause) {
		super(message, cause);
	}
}
