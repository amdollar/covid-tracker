package com.example.demo.Util;

import org.springframework.stereotype.Component;

import com.example.demo.Model.User;

@Component
public class Validator {

	public String validateUserInforamtion(User user) {
		String error = "";
		String phoneno = String.valueOf(user.getPhoneno());
		if (phoneno.length() < 0 && phoneno.length() <= 10) {
			error = "Phone number invalid";
		} else if (user.getFullname() == null) {
			error = "Full name invalid";
		}
		return error;
	}

}
