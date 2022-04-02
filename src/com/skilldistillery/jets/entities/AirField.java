package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

	// User story 4
	// Display menu with items 1-9
	public void displayMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please make your selection: ");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		int selection = sc.nextInt();

		switch (selection) {
		case 1:
			listFleet();
			break;
		case 2:
			fly();
			break;
		case 3:
			showFastestJet();
			break;
		case 4:
			showLongestRange();
			break;
		case 5:
			loadCargoJets();
			break;
		case 6:
			dogFight();
			break;
		case 7:
			addNewJet();
			break;
		case 8:
			removeJet();
			break;
		case 9:
			quitProgram();
			break;
		default:
			break;

		}
	}

	// selection 1
	private void listFleet() {
		for (Jet jet : jetsList) {
			System.out.println(jet);
		}
	}

	// selection 2
	public void fly() {
		for (Jet jet : jetsList) {
			jet.fly();
		}
	}

	// selection 3
	public void showFastestJet() {
		Jet fastest = jetsList.get(0);
		for (Jet Jet : jetsList) {
			if (fastest.getSpeed() > Jet.getSpeed()) {
				fastest = Jet;
			}
		}
		System.out.print("The fastest jet is:\n " + fastest);
	}

	// selection 4
	private void showLongestRange() {
		// TODO Auto-generated method stub

	}

	// selection 5
	private void loadCargoJets() {
		// TODO Auto-generated method stub

	}

	// selection 6
	private void dogFight() {
		// TODO Auto-generated method stub

	}

	// selection 7
	private void addNewJet() {
		// TODO Auto-generated method stub

	}

	// selection 8
	private void removeJet() {
		// TODO Auto-generated method stub

	}

	// selection 9
	private void quitProgram() {
		// TODO Auto-generated method stub

	}

}
