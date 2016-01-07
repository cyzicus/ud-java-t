import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return 1;
		} else if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
}

public class App {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		animals.add("dog");
		animals.add("pig");
		animals.add("cow");
		animals.add("hamster");
		animals.add("aardvark");
		animals.add("cat");
		animals.add("lemur");
		
		// Sorts based on natural order
		Collections.sort(animals);
		System.out.println("Using natural order sort:");
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		// Sorts based on length of word (using new Comparator)
		Collections.sort(animals, new StringLengthComparator());
		System.out.println("\nUsing custom comparator sort:");
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(45);
		numbers.add(19);
		numbers.add(2);
		numbers.add(91);
		numbers.add(7);
		numbers.add(40);
		numbers.add(51);
		
		// Sorts based on natural order
		Collections.sort(numbers);
		System.out.println("\nUsing natural order sort:");
		for(int number: numbers) {
			System.out.println(number);
		}
		
		// Sorts based on custom comparator (in this case anonymous class)
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}		
		});
		System.out.println("\nUsing custom comparator sort:");
		for(int number: numbers) {
			System.out.println(number);
		}
		
		// Sorting custom objects
		List<Person> people = new ArrayList<Person>();
		
		Person p1 = new Person(1, "Joe");
		Person p2 = new Person(2, "Abby");
		Person p3 = new Person(3, "Drew");
		Person p4 = new Person(4, "Carrie");
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		System.out.println("\nUsing no sorting:");
		for(Person person : people) {
			System.out.println(person);
		}
		
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		System.out.println("\nUsing custom sorting on name:");
		for(Person person : people) {
			System.out.println(person);
		}
	}

}
