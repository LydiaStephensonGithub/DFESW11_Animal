package com.lms;

import com.lms.children.Bear;
import com.lms.children.Goat;
import com.lms.children.Hawk;
import com.lms.children.Shark;

public class Runner {
	public static void main(String[] args) {
		Shark shark = new Shark("Sammy", "Shark", 0, 8, 4);
		System.out.println(shark.speak());
		System.out.println(shark.score());
		
		Hawk hawk = new Hawk("Harriet", "Hawk", 0, 7, 3);
		System.out.println(hawk.speak());
		System.out.println(hawk.score());
		
		Bear bear = new Bear("Barry", "Bear", 0, 5, 9);
		System.out.println(bear.speak());
		System.out.println(bear.score());
		
		Goat goat = new Goat("Gertrude", "Goat", 0, 9, 5);
		System.out.println(goat.speak());
		System.out.println(goat.score());
		
		System.out.println(bear.attack(hawk));
	}
}
