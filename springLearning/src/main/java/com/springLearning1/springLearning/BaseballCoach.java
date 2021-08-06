package com.springLearning1.springLearning;

public class BaseballCoach implements Coach {
	
	fortuneService temp;
	private String emailAddress;
	private String password;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BaseballCoach(fortuneService temp) {
		this.temp=temp;
	}
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	public String getMyFortune() {
		return temp.getFortune();
	}
	public String getCredentials() {
		
		return getEmailAddress()+" "+ getPassword();
	}

}








