package com.nagarro.nagp.usermangamentservice.services;

import com.nagarro.nagp.usermangamentservice.dto.UserAuthenticatorDto;

public interface UserAuthenticatorService {

	String validateUser(UserAuthenticatorDto userAuthenticatorDto);

	boolean validateToken(String token);

}
