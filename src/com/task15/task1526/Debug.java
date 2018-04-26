package com.task15.task1526;
/*
 * Fix error, using debug
 */

public class Debug {
	public static void main(String[] args) {
		new B(6);
	}

	public static class A {
		private int f1 = 7;

		public A(int f1) {
			this.f1 = f1;
			initialize(); // in case protected void initialize() - calls method from class B (f1==0)
		}

		// protected
		private void initialize() {
			System.out.println(f1);
		}
	}

	public static class B extends A {

		protected int f1 = 3;

		public B(int f1) {
			super(f1);
			this.f1 += f1;
			initialize();
		}

		// @Override - not needed after change initialize of parent class to private
		protected void initialize() {
			System.out.println(f1);
		}
	}

}
