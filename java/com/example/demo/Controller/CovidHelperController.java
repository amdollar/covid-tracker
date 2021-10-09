package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceInterface.UserServiceInterface;
import com.example.demo.Exceptations.UserNotRegistered;
import com.example.demo.Model.AssestmentForm;
import com.example.demo.Model.User;

@RestController
@RequestMapping("/")
public class CovidHelperController {

	@Autowired
	private UserServiceInterface userService;

	@PostMapping("/registerUser")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		String res = userService.registerUser(user);
		if (res.contains("invalid")) {
			throw new UserNotRegistered();
		} else {
			return ResponseEntity.ok("riskPercentage : " + res);
		}
	}

	@PostMapping("/selfAssessment")
	public ResponseEntity<String> selfAssestment(@RequestBody AssestmentForm form) {
		String response = userService.calculateRisk(form);
		return ResponseEntity.ok("riskPercentage : " + response);
	}

}
