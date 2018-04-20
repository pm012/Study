package com.taksk14.task1415;

public class AppartmentVisitor implements ClenableVisitor {

	@Override
	public void visit(Apt1Room app) {
		app.clean1Room();
	}

	@Override
	public void visit(Apt2Room app) {

		app.clean2Rooms();
	}

	@Override
	public void visit(Apt3Room app) {

		app.clean3Rooms();
	}

}
