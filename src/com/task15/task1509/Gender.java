package com.task15.task1509;

public class Gender {

	public static void main(String[] args) {

		Human man = new Man();
		Human woman = new Woman();

		printName(man);
		printName(woman);
	}

	public static void printName(Human man) {
		System.out.println(man.getClass().getSimpleName());
		throw new NullPointerException();

	}

	public static class Human {

	}

	public static class Man extends Human {

	}

	public static class Woman extends Human {

	}

}
