package com.example.demo.service.user.twilio;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class Twilioproperties {
	
	
	public Twilioproperties() {
		this.accountSid="";
		this.authToken="";
		this.fromNumber="";
	}
	
	private String accountSid;
	private String authToken;
	private String fromNumber;
	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getFromNumber() {
		return fromNumber;
	}
	public void setFromNumber(String fromNumber) {
		this.fromNumber = fromNumber;
	}
	@Override
	public String toString() {
		return "Twilioproperties [accountSid=" + accountSid + ", authToken=" + authToken + ", fromNumber=" + fromNumber
				+ "]";
	}
	
	
	

}
