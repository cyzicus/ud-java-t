import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("dog");
		animals.add("cat");
		animals.add("squirrel");
		animals.add("bear");
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			// items can be removed from a list using iterator
			// this cannot be done in a for loop
			if(value.equals("cat")) {
				it.remove();
			}
		}
		
		System.out.println("");
		
		// Modern iteration; 1.5 and later
		for(String animal: animals) {
			System.out.println(animal);
			//animals.remove(animal); This throws an error...see above
		}

	}

}
