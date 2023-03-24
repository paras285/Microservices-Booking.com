package com.nagarro.nagp.usermangamentservice.services.impl;

import java.util.Base64;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.usermangamentservice.dao.UserAuthenticatorDao;
import com.nagarro.nagp.usermangamentservice.dto.UserAuthenticatorDto;
import com.nagarro.nagp.usermangamentservice.entities.User;
import com.nagarro.nagp.usermangamentservice.services.UserAuthenticatorService;
import com.nagarro.nagp.usermangamentservice.utils.JwtTokenUtil;

@Service
public class UserAuthenticatorServiceImpl implements UserAuthenticatorService {

	@Autowired
	private UserAuthenticatorDao userAuthenticatorDao;

	@Autowired
	private JwtTokenUtil jwtUtil;

	@Override
	public String validateUser(UserAuthenticatorDto userAuthenticatorDto) {
		byte[] passwordByte = Base64.getEncoder().encode(userAuthenticatorDto.getPassword().getBytes());
		String encryptedPassword = new String(passwordByte);
		User user = userAuthenticatorDao.getUserDetails(userAuthenticatorDto.getEmailId());
		if (Objects.nonNull(user)) {
			String password = userAuthenticatorDao.getEncryptedPassword(user.getEmailId());
			if (password.equals(encryptedPassword)) {
				return generateJwtToken(user.getId());
			}
		}
		return "Please enter correct details";

	}

	private String generateJwtToken(String id) {
		return jwtUtil.generateToken(id);
	}

	@Override
	public boolean validateToken(String token) {
		System.out.println("Validating Token()");
		return jwtUtil.validateToken(token);
	}

}
