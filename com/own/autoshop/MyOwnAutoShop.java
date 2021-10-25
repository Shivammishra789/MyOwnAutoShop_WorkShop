package com.own.autoshop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my own auto shop!");
		
		Car sedan = new Sedan(120, 800000, "Yellow", 25);  //creating object for sedan car
		Car ford = new Ford(140, 600000, "Red", 2002, 10);  //creating object for ford car
		Car ford1 = new Ford(160, 800000, "Blue", 2015, 5);  //creating object for ford car
		Car car = new Car(60, 1000000, "black");			//creating object for car
		
		System.out.println(sedan);
		System.out.println(ford);
		System.out.println(ford1);
		System.out.println(car);
	}
}
