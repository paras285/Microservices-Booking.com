package com.nagarro.nagp.notificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.nagarro.nagp.notificationService.dto.PaymentRefundDTO;
import com.nagarro.nagp.notificationService.service.RefundService;

@Component
public class NotificationEvent {
	
	
	@Autowired
	private RefundService refundService;

	@JmsListener(destination = "notifyUserAboutConfirmation")
	public void notifyUserAboutConfirmedBookingEvent(String payLoad) {
		System.out.println("In NotificationService: Booking Confirmed");
	}

	@JmsListener(destination = "notifyUserAboutRejection")
	public void notifyUserAboutRejectionEventt(String payLoad) {
		System.out.println("In NotificationService: Booking Cancelled");
	}

	@JmsListener(destination = "startRefundEvent")
	public void startRefundProcessEvent(String payLoad) {

		PaymentRefundDTO paymentRefundDto = new Gson().fromJson(payLoad, PaymentRefundDTO.class);
		System.out.println(paymentRefundDto);
		System.out.println("PayLoad in refund even is "+payLoad);
		System.out.println("In NotificationService: Refund Event Initiated");
		refundService.refundUserAmount(paymentRefundDto);
	}
}
