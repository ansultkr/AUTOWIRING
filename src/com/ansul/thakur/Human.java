package com.ansul.thakur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	
	public void startPumping() {
		if(heart!=null) {
		heart.pump();
		System.out.println(heart.getNameOfAnimal()+" ::Name of the Animal");
		System.out.println(heart.getNoOfHeart()+" ::Number of Heart in the Animal");
		}
		else System.out.println("Your dead");
	}
}
