package com.task14.task1411;

import com.task14.task1411.Person.Coder;
import com.task14.task1411.Person.Loser;
import com.task14.task1411.Person.Proger;
import com.task14.task1411.Person.User;

//Interface for implementing visitor pattern
public interface PersonVisitor {
	void visit(User user);

	void visit(Loser loser);

	void visit(Coder coder);

	void visit(Proger proger);

}
