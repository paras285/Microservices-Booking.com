package com.nagarro.nagp.checkoutservice.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializerUtil{
	
	 private static final ObjectMapper objectMapper = new ObjectMapper();

	  public static String serialize(Object object) {
		    String retVal = null;
		    try {
		      retVal = objectMapper.writeValueAsString(object);
		    } catch (Exception e) {
		    	System.out.println("Error occured while serializing"+e);
		    }
		    return retVal;
		  }
}
