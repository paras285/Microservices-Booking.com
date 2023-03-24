package com.nagarro.nagp.usermangamentservice.dao;

import com.nagarro.nagp.usermangamentservice.entities.User;

public interface UserAuthenticatorDao {

	User getUserDetails(String emailId);

	String getEncryptedPassword(String emailId);

}
