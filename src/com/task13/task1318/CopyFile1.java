package com.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//analog with FileInputStream

public class CopyFile1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String filename = reader.readLine();
		FileInputStream fis = new FileInputStream(filename);

		BufferedReader file = new BufferedReader(new InputStreamReader(fis, "windows-1251"));

		while (file.ready()) {
			System.out.println(file.readLine());
		}

		file.close();
		reader.close();
		fis.close();

	}

}
