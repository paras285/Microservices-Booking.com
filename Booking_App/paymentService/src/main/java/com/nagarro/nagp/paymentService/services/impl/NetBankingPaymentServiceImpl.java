package com.nagarro.nagp.paymentService.services.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.nagp.paymentService.dto.PaymentDetails;
import com.nagarro.nagp.paymentService.dto.ServiceMapping;
import com.nagarro.nagp.paymentService.services.PaymentService;

@Service
@Qualifier("netBanking")
public class NetBankingPaymentServiceImpl implements PaymentService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ServiceMapping serviceMapping;

	@Override
	public boolean confirmBookingPayment(PaymentDetails paymentDetails) {
		String url = serviceMapping.getUserBalance();
		String userBalance = restTemplate.postForObject(url, paymentDetails.getUserId(), String.class);
		System.out.println("User Balance is: " + userBalance);
		System.out.println("Payment Price is: " + paymentDetails.getPrice());

		if (StringUtils.isNotBlank(userBalance) && !userBalance.equalsIgnoreCase("USER NOT FOUND")
				&& Double.valueOf(userBalance) < Double.valueOf(paymentDetails.getPrice())) {
			System.out.println("Unable to deduct money");
			return false;
		}
		return deductAmountFromUserAccount(paymentDetails);
	}

	private boolean deductAmountFromUserAccount(PaymentDetails paymentDetails) {
		System.out.println("Deducting Money");
		String url = serviceMapping.getDeductUserBalance();
		return restTemplate.postForObject(url, paymentDetails, Boolean.class);
	}

}
