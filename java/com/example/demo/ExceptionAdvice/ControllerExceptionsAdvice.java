package com.example.demo.ExceptionAdvice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exceptations.UserNotRegistered;

@ControllerAdvice
public class ControllerExceptionsAdvice {

	@ExceptionHandler(value = UserNotRegistered.class)
	public ResponseEntity<Object> userNotRegistered(UserNotRegistered unr) {
		throw new UserNotRegistered("User registration not successfull");
	}
}
