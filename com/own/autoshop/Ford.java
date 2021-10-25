package com.own.autoshop;

public class Ford extends Car {

	int year;
	int manufacturerDiscount;
	
	//using constructor to set value to instance variables
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	

	public double getSalePrice() {
		regularPrice -= (regularPrice*manufacturerDiscount/100);		//giving manufacturerDiscount on regular price
		return regularPrice;	
	}

	@Override
	public String toString() {
		return "Ford [year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + ", speed=" + speed
				+ ", regularPrice=" + regularPrice + ", color=" + color + ", Saleprice=" + getSalePrice() + "]";
	}
}
