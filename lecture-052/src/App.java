
public class App {

	public static void main(String[] args) {
		App app = new App();

		int value = 7;
		System.out.println("1. Value is: " + value);

		app.show(value);
		
		System.out.println("4. Value is: " + value + "\n");
		
		Person person = new Person("Bob");
		
		app.show(person);
		
		// Should be "Sue" because the original person's name
		// was changed from "Bob" to "Sue" in the show method
		// and the new person created in that method actually
		// only creates a new address so does not reference
		// the original "Bob/Sue" object
		System.out.println("6. Person is: " + person);
		
	}
	
	public void show(int value) {
		System.out.println("2. Value is: " + value);
		
		value = 8;
		
		System.out.println("3. Value is: " + value);
	}
	
	public void show(Person person){
		System.out.println("2. Person is: " + person);
		
		// The original person's name was changed because only
		// the address of the person was passed in by value
		person.setName("Sue");
		
		System.out.println("3. Person is: " + person);
		
		// "person" now refers to a new address created...the original object 
		// has not been overwritten
		person = new Person("Mike");
		System.out.println("4. Person is: " + person);
		
		person.setName("Freddy");
		System.out.println("5. Person is: " + person);
	}

}
