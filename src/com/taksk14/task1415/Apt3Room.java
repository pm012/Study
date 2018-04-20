package com.taksk14.task1415;

public class Apt3Room implements Apartment {
	void clean3Rooms() {
		System.out.println("3 rooms are cleaned");
	}

	@Override
	public void accept(ClenableVisitor clenableVisitor) {
		clenableVisitor.visit(this);

	}

}
