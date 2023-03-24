package com.nagarro.nagp.paymentService.services;

import com.nagarro.nagp.paymentService.dto.PaymentDetails;

public interface PaymentService {

	boolean confirmBookingPayment(PaymentDetails paymentDetails);

}
