package com.annotation.code;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements fortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today Your Fortune is good";
	}

}
