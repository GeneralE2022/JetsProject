package com.skilldistillery.jets.entities;

public class Passenger extends Jet {


	public Passenger (String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price); 
	}


	@Override
	public void fly() {
		System.out.println("Passenger jet taking off!");
	}

}
