package com.nagarro.nagp.usermangamentservice.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.usermangamentservice.dto.UserBalanceDto;
import com.nagarro.nagp.usermangamentservice.services.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@PostMapping("user-balance")
	public String getUserBalance(@RequestBody String userId) {
		return userDetailsService.getUserBalance(userId);
	}
	
	@PostMapping("deduct-user-balance")
	public boolean deductUserBalance(@RequestBody UserBalanceDto userBalance) {
		return userDetailsService.deductUserBalance(userBalance);
	}
	
	@PostMapping("refund-user-balance")
	public boolean refundUserBalance(@RequestBody Map<String,String> userBalance) {
		return userDetailsService.refundUserBalance(userBalance);
	}
}
