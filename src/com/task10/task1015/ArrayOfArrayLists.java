package com.task10.task1015;

import java.util.ArrayList;

public class ArrayOfArrayLists {
	// Create array of arraylists. Fill in the array with any data

	public static void main(String[] args) {
		ArrayList<String>[] arrayOfStringList = createList();
		printList(arrayOfStringList);
	}

	public static ArrayList<String>[] createList() {
		ArrayList<String>[] res = new ArrayList[3];
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(3);
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("el1.Test1");
		al1.add("el1.Test2");
		al1.add("el1.Test3");
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("el2.Test1");
		al2.add("el2.Test2");
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("el3.Test1");
		res[0] = al1;
		res[1] = al2;
		res[2] = al3;
		return res;
	}

	public static void printList(ArrayList<String>[] arrayOfStringList) {
		for (ArrayList<String> list : arrayOfStringList) {
			for (String s : list) {
				System.out.println(s);
			}
		}
	}

}
