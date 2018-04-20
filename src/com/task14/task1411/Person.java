package com.task14.task1411;

public interface Person {
	void accept(PersonVisitor visitor);

	class User implements Person {

		void live() {
			System.out.println("Usually I just live.");
		}

		@Override
		public void accept(PersonVisitor visitor) {
			visitor.visit(this);

		}
	}

	class Loser implements Person {
		void doNothing() {
			System.out.println("Usually I do nothing.");
		}

		@Override
		public void accept(PersonVisitor visitor) {
			visitor.visit(this);

		}
	}

	class Coder implements Person {
		void coding() {
			System.out.println("Usually I create code.");
		}

		@Override
		public void accept(PersonVisitor visitor) {
			visitor.visit(this);

		}
	}

	class Proger implements Person {
		void enjoy() {
			System.out.println("Wonderful life!");
		}

		@Override
		public void accept(PersonVisitor visitor) {
			visitor.visit(this);

		}
	}

}
