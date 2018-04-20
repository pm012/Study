package com.taksk14.task1415;

import java.util.ArrayList;
import java.util.List;

public class Apartments {
	public static void main(String[] args) {
		List<Apartment> apartments = new ArrayList<Apartment>();
		apartments.add(new Apt1Room());
		apartments.add(new Apt2Room());
		apartments.add(new Apt3Room());

		long startTime = System.nanoTime();
		cleanAllApartments(apartments);
		long endTime = System.nanoTime();
		long resVisitor = endTime - startTime;

		startTime = System.nanoTime();
		cleanAllApartments_i(apartments);
		endTime = System.nanoTime();
		long resInstanceOf = endTime - startTime;

		System.out.println("Visitor time is: " + resVisitor);
		System.out.println("Instance of time is " + resInstanceOf);

	}

	// Using visitor pattern
	public static void cleanAllApartments(List<Apartment> apartments) {
		AppartmentVisitor apt = new AppartmentVisitor();
		for (Apartment apts : apartments) {
			apts.accept(apt);
		}
	}

	// Using instanceOf

	public static void cleanAllApartments_i(List<Apartment> apartments) {
		for (Apartment apts : apartments) {
			if (apts instanceof Apt1Room)
				((Apt1Room) apts).clean1Room();
			if (apts instanceof Apt2Room)
				((Apt2Room) apts).clean2Rooms();
			if (apts instanceof Apt3Room)
				((Apt3Room) apts).clean3Rooms();
		}
	}

}
