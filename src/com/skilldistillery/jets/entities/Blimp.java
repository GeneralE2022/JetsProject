package com.skilldistillery.jets.entities;

public class Blimp extends Jet {
	


	public Blimp() {
	}
	
	public Blimp (String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price); 
	}


	@Override
	public void fly() {
		System.out.println("Blimp lifting off!");		
	}

}
