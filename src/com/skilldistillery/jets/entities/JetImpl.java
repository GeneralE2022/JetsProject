package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {
	

	public JetImpl() {

	}
	
	public JetImpl (String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price); 
	}


	@Override
	public void fly() {
		System.out.println("Generic jet taking off!");		
	}

}
