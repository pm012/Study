package com.task14.task1411;

import com.task14.task1411.Person.Coder;
import com.task14.task1411.Person.Loser;
import com.task14.task1411.Person.Proger;
import com.task14.task1411.Person.User;

//the action we want to perform from each person type
public class AddPersonVisitor implements PersonVisitor {

	@Override
	public void visit(User user) {
		user.live();

	}

	@Override
	public void visit(Loser loser) {
		loser.doNothing();

	}

	@Override
	public void visit(Coder coder) {
		coder.coding();

	}

	@Override
	public void visit(Proger proger) {
		proger.enjoy();

	}

}
