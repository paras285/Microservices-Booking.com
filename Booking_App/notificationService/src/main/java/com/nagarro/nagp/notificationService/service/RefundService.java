package com.nagarro.nagp.notificationService.service;

import com.nagarro.nagp.notificationService.dto.PaymentRefundDTO;

public interface RefundService {

	void refundUserAmount(PaymentRefundDTO paymentRefundDto);

}
