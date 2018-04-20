package com.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*1.
 * Enter from keyboard several keys. Keys: "user", "loser", "coder", "proger";
 * Input shoudl be finished when line doesn't match any of the keys
 * 2.
 * Create  the matching object from Person.java(for instance, for key "user" should be created User object)
 * Pass the created object to doWork method
 * 3. Implemnet doWork that should 
 * a. Call live() method from passed object person if the person has type User 
 * b. Call method doNothing() if person has type Loser
 * c. Call method coding() if person has type Coder.
 * d. Call enjoy() method if person has type Proger. 
 * 
 * use visitor pattern to check person type
 */

public class Persons {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Person person = null;
		String key = null;
		Set<String> ts = new TreeSet<String>(Arrays.asList("user", "loser", "coder", "proger"));

		while (ts.contains(key = reader.readLine())) {
			// create an object, item 2 of requirements
			switch (key) {
			case "user":
				person = new Person.User();
				break;
			case "loser":
				person = new Person.Loser();
				break;
			case "coder":
				person = new Person.Coder();
				break;
			case "proger":
				person = new Person.Proger();
				break;
			default:
				person = null;

			}

			doWork(person); // call doWork

		}
	}

	public static void doWork(Person person) {

		PersonVisitor pv = new AddPersonVisitor();
		person.accept(pv);

	}

}
