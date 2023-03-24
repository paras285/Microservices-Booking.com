package com.nagarro.nagp.usermangamentservice.dao;

import java.util.Map;

import com.nagarro.nagp.usermangamentservice.dto.UserBalanceDto;

public interface UserDetailsDao {

	String getUserBalance(String userId);

	boolean deductUserBalance(UserBalanceDto userBalance);

	boolean refundUserBalance(Map<String, String> userBalance);

}
