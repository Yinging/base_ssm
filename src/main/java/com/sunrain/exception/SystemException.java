package com.sunrain.exception;

/**
 * 
 * Title: SystemException.java Description:
 *
 * @author sunrain
 * @date 2017年9月28日
 * @email dybarr@qq.com
 */
public class SystemException extends RuntimeException {

	/** serialVersionUID*/
	private static final long serialVersionUID = -8715340953551909247L;

	public SystemException() {
		super("系统异常");
	}

	public SystemException(String message) {
		super(message);
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}
}
