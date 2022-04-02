package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady {
	

	public Fighter() {

	}
	
	public Fighter (String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price); 
	}


	@Override
	public void fly() {
		System.out.println("Fighter jet taking off!");		
	}

}
