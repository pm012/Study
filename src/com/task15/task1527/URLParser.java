package com.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class URLParser {
	/*
	 * Read URL from console print URL parameters devided with whitespace delimeter
	 * Example: input- http://localhost/alpha/index.html?lvl=15&view&name=Amigo
	 * output: lvl view name
	 * 
	 * input: http://localhost/alpha/index.html?obj=3.14&name=Amigo
	 * 
	 * output: obj name
	 * 
	 * double 3.14
	 * 
	 */

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> doubleVal = new ArrayList<>();
		try {
			String url = reader.readLine();

			String str1 = url.substring(url.indexOf('?') + 1);
			String[] parameters = str1.split("&");

			for (String s : parameters) {

				if (s.contains("=")) {
					String sVal = s.substring(s.indexOf('=') + 1);
					String sPar = s.substring(0, s.indexOf("="));// remove -11
					System.out.print(sPar + " ");
					double dVal;
					try {

						if (sVal.contains(".")) {
							dVal = Double.parseDouble(sVal);
							doubleVal.add(dVal);
						}

					} catch (NumberFormatException e) {
						System.out.println("ERROR: " + e.getMessage());
						continue;

					}
				} else {
					System.out.print(s + " ");
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

		System.out.println();

		for (Double d : doubleVal) {
			alert(d);
		}

	}

	public static void alert(double value) {
		System.out.println("double " + value);
	}

	public static void alert(String value) {
		System.out.println("String " + value);
	}

}
