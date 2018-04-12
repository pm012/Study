package com.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LettersNumber {
	/*Enter 10 rows from keyboard and count number of different letters (for 33 alphabet letters in lower case) 
	 *The result should be sown on the screen in alphabetical order.

	Input example:
	а 5
	б 8
	в 3
	г 7
	д 0
	...
	я 9


	Requirements:
	1. The programm should read data from keyboard.
	2. The program should print the text to the screen.
	3. Output text should contain 33 rows.
	4. Each row should contain letter of Russian alphabet, space  and how many time the letter was present in entered rows.
	*/

	public static void main(String[] args) throws Exception{
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        // алфавит
	        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
	        char[] abcArray = abc.toCharArray();

	        ArrayList<Character> alphabet = new ArrayList<Character>();
	        for (int i = 0; i < abcArray.length; i++) {
	            alphabet.add(abcArray[i]);
	        }

	        // ввод строк
	        ArrayList<String> list = new ArrayList<String>();
	        for (int i = 0; i < 10; i++) {
	            String s = reader.readLine();
	            list.add(s.toLowerCase());

	}

}
}
