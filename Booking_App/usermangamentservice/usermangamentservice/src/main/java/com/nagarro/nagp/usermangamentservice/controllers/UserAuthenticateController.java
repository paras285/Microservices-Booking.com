package com.nagarro.nagp.usermangamentservice.controllers;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.usermangamentservice.dto.UserAuthenticatorDto;
import com.nagarro.nagp.usermangamentservice.services.UserAuthenticatorService;

@RestController
public class UserAuthenticateController {

	@Autowired
	private UserAuthenticatorService userAuthenticatorService;

	@PostMapping("authenticate")
	public String validateUser(@RequestBody UserAuthenticatorDto userAuthenticatorDto) {
		if (StringUtils.isEmpty(userAuthenticatorDto.getEmailId())
				|| StringUtils.isEmpty(userAuthenticatorDto.getPassword())) {
			return "Email/Password cannot be empty";
		}
		return userAuthenticatorService.validateUser(userAuthenticatorDto);

	}

	@GetMapping("validate-token")
	public boolean validateToken(@RequestParam String token) {
		return userAuthenticatorService.validateToken(token);
	}
	
}
