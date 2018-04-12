package com.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EqualWordsInList {
	/*
	 * Enter 20 words to the list. count and pring how many times the word is
	 * present in the list use Map<String, Integer> dictionary letter registry
	 * influences the result print the dictionary result to the screen
	 */

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> words = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			words.add(reader.readLine());
		}

		Map<String, Integer> map = countWords(words);

		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
	}

	public static Map<String, Integer> countWords(ArrayList<String> list) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();

		for (String str : list)
			result.put(str, Collections.frequency(list, str));

		return result;
	}

}
