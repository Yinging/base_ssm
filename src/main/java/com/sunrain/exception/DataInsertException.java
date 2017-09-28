package com.sunrain.exception;

/**
 * 
 * Title: DataInsertException.java Description:
 *
 * @author sunrain
 * @date 2017年9月28日
 * @email dybarr@qq.com
 */
public class DataInsertException extends SystemException {
	/** serialVersionUID*/
	private static final long serialVersionUID = 2107947777341174413L;

	public DataInsertException() {
		super("数据插入失败");
	}

	public DataInsertException(String message) {
		super(message);
	}

	public DataInsertException(String message, Throwable cause) {
		super(message, cause);
	}
}
