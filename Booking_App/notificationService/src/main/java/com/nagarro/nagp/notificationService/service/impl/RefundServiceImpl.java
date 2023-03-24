package com.nagarro.nagp.notificationService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.nagp.notificationService.dto.PaymentRefundDTO;
import com.nagarro.nagp.notificationService.service.RefundService;

@Service
public class RefundServiceImpl implements RefundService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void refundUserAmount(PaymentRefundDTO paymentRefundDto) {
		String url  = "http://user-service/user/refund-user-balance";
		boolean paymentRefundStatus = restTemplate.postForObject(url, paymentRefundDto, boolean.class);
		System.out.println("Payment Refund Status: "+paymentRefundStatus);
	}

}
