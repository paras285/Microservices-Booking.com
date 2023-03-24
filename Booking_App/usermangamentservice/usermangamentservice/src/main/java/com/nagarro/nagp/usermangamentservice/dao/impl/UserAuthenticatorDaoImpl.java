package com.nagarro.nagp.usermangamentservice.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.nagp.usermangamentservice.UserHelper;
import com.nagarro.nagp.usermangamentservice.dao.UserAuthenticatorDao;
import com.nagarro.nagp.usermangamentservice.entities.User;
import com.nagarro.nagp.usermangamentservice.entities.UserPassword;

@Repository
public class UserAuthenticatorDaoImpl implements UserAuthenticatorDao {

	@Autowired
	private UserHelper userHelper;
	
	@Override
	public User getUserDetails(String emailId) {
		Optional<User> userOptional = userHelper.getUserList().stream().filter(user -> user.getEmailId().equalsIgnoreCase(emailId))
				.findFirst();
		if (userOptional.isPresent()) {
			return userOptional.get();
		}
		return null;
	}

	@Override
	public String getEncryptedPassword(String emailId) {

		return userHelper.getUserPasswordList().stream()
				.filter(userPassword -> userPassword.getEmailAddress().equals(emailId))
				.map(UserPassword::getPassword)
				.findFirst()
				.orElse(null);
	}

}
