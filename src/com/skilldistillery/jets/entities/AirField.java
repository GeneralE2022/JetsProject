package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	// fields
	private List<Jet> jetsList;

	// constructors
	public void buildFleet() {
		jetsList = new ArrayList<>();
	}

	// methods 
	public void readData() {
		String line;
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			while ((line = bufIn.readLine()) != null) {
				String[] arrayOfJets = line.split(",");
				
				// populate each array field with the appropriate jet data from jets.txt 
				String name = arrayOfJets[0];
				String model = arrayOfJets[1];
				double speed = Double.parseDouble(arrayOfJets[2]);
				int range = Integer.parseInt(arrayOfJets[3]);
				long price = Long.parseLong(arrayOfJets[4]);

				// if row is a Passenger, then instantiate a Passenger and add to list of Jets
				// if row is a Fighter, then instantiate a Fighter and add to list of Jets
				// if row is a Blimp, then instantiate a Blimp and add to list of Jets

				if (arrayOfJets[0].equals("Passenger")) {
					jetsList.add(new Passenger(name, model, speed, range, price)); 
				}

				else if (arrayOfJets[0].equals("Fighter")) {
					jetsList.add(new Fighter(name, model, speed, range, price)); 
				}

				else if (arrayOfJets[0].equals("Blimp")) {
					jetsList.add(new Blimp(name, model, speed, range, price)); 
				}
			}

		} catch (IOException e) {
			System.err.println(e);

		}

	}
	
	//
	
	
	
}