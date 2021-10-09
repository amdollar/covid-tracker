package com.example.demo.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServiceInterface.UserServiceInterface;
import com.example.demo.Dao.UserRepository;
import com.example.demo.Model.User;
import com.example.demo.Util.Validator;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	UserRepository dao;
	@Autowired
	Validator validator;

	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public String registerUser(User user) {
		String retval = validator.validateUserInforamtion(user);
		if (retval.length() > 0) {
			logger.log(Level.WARNING, retval);
		} else {
			logger.log(Level.INFO, "Registering user information with userid : " + user.getUserid());
			dao.save(user);
			retval = String.valueOf(user.getUserid());
		}
		return retval;
	}

	@Override
	public String calculateRisk(com.example.demo.Model.AssestmentForm form) {
		String riskpercentage = "";
		if (form.getSympotms().length == 0 && form.isHistory() == (false) && form.isContacted() == false) {
			riskpercentage = "5 %";
		} else if (form.getSympotms().length == 1 && form.isHistory() == (true) && form.isContacted() == (true)) {
			riskpercentage = "50 %";
		} else if (form.getSympotms().length == 2 && form.isHistory() == (true) && form.isContacted() == (true)) {
			riskpercentage = "75 %";
		}
		return riskpercentage;
	}

}
