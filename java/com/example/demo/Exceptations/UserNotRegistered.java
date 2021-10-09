package com.example.demo.Exceptations;

import org.springframework.stereotype.Component;

@Component
public class UserNotRegistered extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotRegistered() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserNotRegistered(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserNotRegistered(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserNotRegistered(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserNotRegistered(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
