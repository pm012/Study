package com.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WorkWithHashMap {
	/*
	 * Hash map String value should not be repeated, int -can be repeated Empty
	 * string - exit values input Nothing should be lost (e.g. if number is entered
	 * it should be displayed after map is printed
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String sid = "";
		String sName = "";

		do {
			sid = reader.readLine();
			if (sid.equals("")) {
				break;
			}
			sName = reader.readLine();
			if (sName.equals("")) {
				break;
			}

			int index = Integer.parseInt(sid);
			hm.put(sName, index);

		} while (true);

		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			String name = entry.getKey();
			int id = entry.getValue();
			System.out.println(id + " " + name);
		}
		if (!sid.equals(""))
			System.out.println(sid + " " + sName);
	}

}
