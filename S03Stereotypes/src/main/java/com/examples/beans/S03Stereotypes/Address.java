package com.examples.beans.S03Stereotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Chennai")
	private String city;
	
	@Value("TN")
	private String state;
	
	@Value("577161")
	private String pincode;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}

