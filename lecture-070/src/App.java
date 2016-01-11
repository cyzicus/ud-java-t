interface Executable {
	void execute();
}

interface IntExecutable {
	int execute();
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block...");
		e.execute();
	}

	public void run(IntExecutable e) {
		System.out.println("Executing alternate code block...");
		int value = e.execute();
		System.out.println("Returned value is: " + value);
	}

	public void run(StringExecutable e) {
		System.out.println("Executing the third code block...");
		int value = e.execute("Hello");
		System.out.println("Returned value is: " + value);
	}
}

public class App {

	public static void main(String[] args) {

		Runner runner = new Runner();

		// Old way (pre-1.8)
		runner.run(new Executable() {
			public void execute() {
				System.out.println("Hello there");
			}
		});
		printSeparator();

		// New way (1.8+)
		runner.run(() -> System.out.println("Right back at ya!"));

		printSeparator();

		// Can also do multiple lines of code
		runner.run(() -> {
			System.out.println("Passed in via lambda expression");
			System.out.println("Cool, isn't it?");
		});

		printSeparator();

		// Functions with return values
		runner.run(() -> {
			System.out.println("I'm expecting a return value of 9");
			return 9;
		});

		printSeparator();

		// Don't even need a "return" statement if it's a single line
		runner.run(() -> 8);

		printSeparator();

		// You can also pass in parameters to a function
		runner.run((String a) -> {
			System.out.println("Passing in an unused string??");
			return 12;
		});

		printSeparator();
		
		// This is the same thing as above
		runner.run(a -> {
			System.out.println("Don't need to pass in () and type declaration if not ambiguous");
			return 4;
		});
	}

	private static void printSeparator() {
		System.out.println("");
		System.out.println("=======================");
		System.out.println("");
	}

}
