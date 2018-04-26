package com.task15.task1525;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Initialize file from Statics.FILE_NAME field. FILE_NAME variable should be static and final and contain full path to the file
 * The file should contain several lines. 
 * All lines of file should be added to list in static block
 * The list should be displayed to screen in main block
 */

public class FileStatic {
	public static List<String> lines = new ArrayList<String>();

	static {

		File file = new File(Statics.FILE_NAME);
		try (FileReader fileReader = new FileReader(file)) {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while (reader.ready()) {
				lines.add(reader.readLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}

	public static void main(String[] args) {
		System.out.println(lines);
	}

}
