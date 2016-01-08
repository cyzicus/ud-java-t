import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		//return name.compareTo(o.name);
		
		int len1 = name.length();
		int len2 = o.name.length();
		
		if(len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		
		return name.compareTo(o.name);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();

		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		showElements(set);
	}
	
	public static void addElements(Collection<Person> collection) {
		collection.add(new Person("Joe"));
		collection.add(new Person("Sue"));
		collection.add(new Person("Juliet"));
		collection.add(new Person("Mike"));
		collection.add(new Person("Claire"));
	}
	
	public static void showElements(Collection<Person> collection) {
		System.out.println("Displaying elements in " + collection.getClass().getSimpleName());
		for(Person person : collection) {
			System.out.println(person);
		}
		System.out.println();
	}

}
