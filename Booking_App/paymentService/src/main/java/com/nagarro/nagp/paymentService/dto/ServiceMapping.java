package com.nagarro.nagp.paymentService.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "url")
public class ServiceMapping {

	private String userBalance;
	private String deductUserBalance;

	public String getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(String userBalance) {
		this.userBalance = userBalance;
	}

	public String getDeductUserBalance() {
		return deductUserBalance;
	}

	public void setDeductUserBalance(String deductUserBalance) {
		this.deductUserBalance = deductUserBalance;
	}

}
