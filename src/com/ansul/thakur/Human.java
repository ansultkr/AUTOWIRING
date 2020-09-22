package com.ansul.thakur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart heart;
	
	public Human() {
		
	}
	
	
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human Constructor is getting called whicha has Heart as argument");
	}
	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Mathod Called! @Autowiring byName");
		
	}
	
	public void startPumping() {
		if(heart!=null) {
		heart.pump();
		System.out.println(heart.getNameOfAnimal()+" ::Name of the Animal");
		System.out.println(heart.getNoOfHeart()+" ::Number of Heart in the Animal");
		}
		else System.out.println("Your dead");
	}
}
