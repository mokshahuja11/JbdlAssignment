package question1;

import java.util.ArrayList;
import java.util.Collections;



//Q1.Create a person class, it should contains the id, name, salary and age. Make a ArrayList of this person class type and sort this array based on below criteria (Use Comparable interface)   - Sort on the name, if the names are equal then sort on the basis of salary


public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personArray = new ArrayList<Person>();

		personArray.add(new Person(1, "Moksh", 100000, 25));
		personArray.add(new Person(2, "Rishabh", 200000, 28));
		personArray.add(new Person(3, "Aditi", 300000, 23));
		personArray.add(new Person(4, "Moksh", 400000, 24));

		System.out.println("Before Sorting");
		for (Person p : personArray) {
			System.out.println(p);
		}

		Collections.sort(personArray);
		System.out.println("After Sorting");
		for (Person p : personArray) {
			System.out.println(p);
		}
	}

}
