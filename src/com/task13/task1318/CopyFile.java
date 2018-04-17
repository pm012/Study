package com.task13.task1318;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Read filename from console and print on screen its content
 * Don't forget to release resources. 
 */

public class CopyFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = br.readLine();

		BufferedReader fbr = new BufferedReader(new FileReader(fileName));
		System.out.println("init");
		String str = null;
		while ((str = fbr.readLine()) != null) {
			System.out.println(str);
		}

		br.close();
		fbr.close();

	}

}
