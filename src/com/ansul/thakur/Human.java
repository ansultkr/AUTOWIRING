package com.ansul.thakur;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart;
	
	public Human() {
		
	}
	
	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human Constructor is getting called whicha has Heart as argument");
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Mathod Called! @Autowiring byName");
	}
	
	public void startPumping() {
		if(heart!=null) {
		heart.pump();
		}
		else System.out.println("Your dead");
	}
}
