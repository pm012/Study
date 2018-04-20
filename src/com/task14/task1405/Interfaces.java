package com.task14.task1405;

/* 
Food
*/

public class Interfaces {
	public static void main(String[] args) {
		Food food = new Food();
		Selectable selectable = new Food();
		Food newFood = (Food) selectable;

		foodMethods(food);
		selectableMethods(selectable);
	}

	public static void foodMethods(Food food) {
		food.eat();
		food.onSelect();
	}

	public static void selectableMethods(Selectable selectable) {

		selectable.onSelect();
	}

	interface Selectable {
		void onSelect();
	}

	static class Food implements Selectable {
		public void eat() {
			System.out.println("food was eaten");
		}

		@Override
		public void onSelect() {
			System.out.println("food was selected");

		}
	}
}
