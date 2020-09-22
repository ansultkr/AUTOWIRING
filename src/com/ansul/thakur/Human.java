package com.ansul.thakur;

public class Human {
	
	private Heart heart;

	public Human(Heart heart) {
		this.heart = heart;
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
