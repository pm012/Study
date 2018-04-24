package com.task14.task1415;

public class Apt1Room implements Apartment {
	void clean1Room() {
		System.out.println("1 room is cleaned");
	}

	@Override
	public void accept(ClenableVisitor clenableVisitor) {
		clenableVisitor.visit(this);

	}

}
