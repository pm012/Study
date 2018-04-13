package com.task12.task1229;

public class InterfacesLearn {

	public static void main(String[] args) {
		CTO cto = new CTO();
		System.out.println(cto);
	}

	public static interface Businessman {
		public void workHard();
	}

	public static class CTO extends Employee implements Businessman {

	}

	public static class Employee implements Businessman {

		@Override
		public void workHard() {

		}

	}
}
