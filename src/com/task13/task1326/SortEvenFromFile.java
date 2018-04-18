package com.task13.task1326;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEvenFromFile {
	/*
	 * Read even digits from file. Print the digits sorted in asc order
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		File file = new File(reader.readLine());
		FileInputStream fileInput = new FileInputStream(file);
		reader = new BufferedReader(new InputStreamReader(fileInput));
		String str;
		int number;
		List<Integer> evenNumbers = new ArrayList<>();
		while ((str = reader.readLine()) != null) {
			number = Integer.parseInt(str);
			if (number % 2 == 0)
				evenNumbers.add(number);

		}

		Collections.sort(evenNumbers);
		for (Integer el : evenNumbers) {
			System.out.println(el);
		}

		reader.close();
		fileInput.close();

	}

}
