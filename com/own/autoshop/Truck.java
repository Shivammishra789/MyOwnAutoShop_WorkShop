package com.own.autoshop;

public class Truck extends Car {

	int weight;  // weight is in kg

	//using constructor to set value to instance variables
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public double getSalePrice() {

		if(weight > 2000) {
			regularPrice = regularPrice * 0.9; 
		}
		else
			regularPrice = regularPrice * 0.8;

		return regularPrice; 
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", toString()=" + super.toString() + ", getClass()=" + "]";
	}
}
