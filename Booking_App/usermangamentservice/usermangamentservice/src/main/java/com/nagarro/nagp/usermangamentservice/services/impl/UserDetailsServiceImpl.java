package com.nagarro.nagp.usermangamentservice.services.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.usermangamentservice.dao.UserDetailsDao;
import com.nagarro.nagp.usermangamentservice.dto.UserBalanceDto;
import com.nagarro.nagp.usermangamentservice.services.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsDao userDetailsDao;

	@Override
	public String getUserBalance(String userId) {
		return userDetailsDao.getUserBalance(userId);
	}

	@Override
	public boolean deductUserBalance(UserBalanceDto userBalance) {
		return userDetailsDao.deductUserBalance(userBalance);
	}

	@Override
	public boolean refundUserBalance(Map<String, String> userBalance) {
		return userDetailsDao.refundUserBalance(userBalance);
	}

}
