package com.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Write2File {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileName = reader.readLine();
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		String line;

		do {

			line = reader.readLine();
			writer.write(line + "\n");

		} while (!line.equals("exit"));

		reader.close();
		writer.close();

	}

}
