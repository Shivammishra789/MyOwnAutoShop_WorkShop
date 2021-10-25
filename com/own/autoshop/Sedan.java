package com.own.autoshop;

public class Sedan extends Car {

	int length;  //length is in feet

	//using constructor to set value to instance variables
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	public double getSalePrice() {
		if(length > 20) {
			regularPrice = regularPrice * 0.95;		//giving 5% discount on regular price
		}
		else
			regularPrice = regularPrice * 0.9;		////giving 10% discount on regular price
		
		return regularPrice;	
	}

	@Override
	public String toString() {
		return "Sedan [length=" + length + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ ", SalePrice=" + getSalePrice() + "]";
	}
}
