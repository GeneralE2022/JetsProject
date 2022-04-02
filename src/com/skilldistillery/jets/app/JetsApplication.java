package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	public static void main(String[] args) {
		
		AirField airField = new AirField();
		airField.buildFleet(); 
		airField.readData(); 
		airField.displayMainMenu();

	
	}
} 
