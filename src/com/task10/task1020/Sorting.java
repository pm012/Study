package com.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sorting {
	/*
	 * Enter 30 digits and get 10-th and 11-th minimal of them
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[30];
		for (int i = 0; i < 30; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}

		sort(array);
		for (Integer i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(array[9]);
		System.out.println(array[10]);
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;

				}

			}
		}
	}

}