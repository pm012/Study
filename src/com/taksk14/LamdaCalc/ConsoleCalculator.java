package com.taksk14.LamdaCalc;

import java.util.function.BiFunction;

//Implement calculator using only one method and lambdas

public class ConsoleCalculator {
	public static void main(String[] args) {
		// instantiate calculator
		ConsoleCalculator calc = new ConsoleCalculator();

		// implementation of addition
		// To integer as input parameters and double as a result
		BiFunction<Integer, Integer, Double> add = (Integer a, Integer b) -> new Double(a + b);
		System.out.println((int) calc.calculate(5, 6, add));

		// same for division
		BiFunction<Integer, Integer, Double> div = (a, b) -> new Double((double) a / (double) b);
		System.out.println(calc.calculate(23, 12, div));

		// same for custom function
		BiFunction<Integer, Integer, Double> myFunc = (a,
				b) -> new Double(Math.pow(((double) a + (double) b) / ((double) a + 117), 2));
		System.out.println(calc.calculate(12, 6, myFunc));

	}

	public double calculate(Integer a, Integer b, BiFunction<Integer, Integer, Double> biFunc) {

		return biFunc.apply(a, b);
	}

}
