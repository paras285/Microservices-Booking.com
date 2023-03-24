package com.nagarro.nagp.usermangamentservice.services;

import java.util.Map;

import com.nagarro.nagp.usermangamentservice.dto.UserBalanceDto;

public interface UserDetailsService {

	String getUserBalance(String userId);

	boolean deductUserBalance(UserBalanceDto userBalance);

	boolean refundUserBalance(Map<String, String> userBalance);

}
