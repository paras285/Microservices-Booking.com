package com.nagarro.nagp.paymentService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.paymentService.dto.PaymentDetails;
import com.nagarro.nagp.paymentService.services.PaymentService;

@RestController
public class ConfirmPayment {

	@Autowired
	@Qualifier("upi")
	private PaymentService upiService;

	@Autowired
	@Qualifier("netBanking")
	private PaymentService netBankingService;

	@PostMapping("confirm")
	public boolean confirmPayment(@RequestBody PaymentDetails paymentDetails) {
		boolean isPaymentConfirmed = false;
		if (paymentDetails.getPaymentOption().equalsIgnoreCase("UPI")) {
			isPaymentConfirmed = upiService.confirmBookingPayment(paymentDetails);
		} else if (paymentDetails.getPaymentOption().equals("NET-BANKING")) {
			isPaymentConfirmed = netBankingService.confirmBookingPayment(paymentDetails);
		}
		return isPaymentConfirmed;
	}
}
