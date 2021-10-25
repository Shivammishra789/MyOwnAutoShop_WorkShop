package com.own.autoshop;

public class Car {

	int speed;
	double regularPrice;
	String color;
	
	//using constructor to set value to instance variables
	public Car(int speed, double regularPrice, String color) {		
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}


	public double getSalePrice() {
		return regularPrice ;  
	}


	@Override
	public String toString() {
		return "Car [speed = " + speed + ", regularPrice = " + regularPrice + ", color=" + color + ", SalePrice = "
				+ getSalePrice() + "]";
	}
}
