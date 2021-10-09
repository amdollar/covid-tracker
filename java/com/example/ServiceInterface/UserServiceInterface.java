package com.example.ServiceInterface;

import org.springframework.stereotype.Service;

import com.example.demo.Model.AssestmentForm;
import com.example.demo.Model.User;

@Service
public interface UserServiceInterface {
	String registerUser(User user);

	String calculateRisk(AssestmentForm form);
}
