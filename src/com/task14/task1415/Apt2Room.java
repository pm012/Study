package com.task14.task1415;

public class Apt2Room implements Apartment {

	void clean2Rooms() {
		System.out.println("2 rooms are cleaned");
	}

	@Override
	public void accept(ClenableVisitor clenableVisitor) {
		clenableVisitor.visit(this);

	}

}
