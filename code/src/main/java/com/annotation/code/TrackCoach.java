package com.annotation.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Autowired
    @Qualifier("badFortune")
	fortuneService temp;
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getMyFortune() {
		// TODO Auto-generated method stub
		return temp.getFortune();
	}

	public String getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

}










