package com.nagarro.nagp.checkoutservice.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "fallback-message")
public class FallbackMessages {

	private String getShortlistHotel;

	public String getGetShortlistHotel() {
		return getShortlistHotel;
	}

	public void setGetShortlistHotel(String getShortlistHotel) {
		this.getShortlistHotel = getShortlistHotel;
	}

}
