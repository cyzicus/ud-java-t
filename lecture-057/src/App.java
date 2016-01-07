import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		// HashSets can't be guaranteed to maintain order
		Set<String> hashSet = new HashSet<String>();
		populateSet(hashSet);

		// LinkedHashSets will NEVER maintain order
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		populateSet(linkedHashSet);
		
		// TreeSets will ALWAYS maintain natural order
		Set<String> treeSet = new TreeSet<String>();
		populateSet(treeSet);
		
		System.out.println("\nContains:");
		if(treeSet.contains("cat")) {
			System.out.println("Set contains 'cat'");
		}
		
		System.out.println("\nIsEmpty:");
		if(treeSet.isEmpty()) {
			System.out.println("Set is empty");
		} else {
			System.out.println("Set is not empty");
		}
		
		System.out.println("\nIteration:");
		for(String animal : treeSet) {
			System.out.println(animal);
		}
		
		System.out.println("\nIntersection of:");
		hashSet.clear();
		hashSet.add("dog");
		hashSet.add("giraffe");
		hashSet.add("panda");
		hashSet.add("hamster");
		hashSet.add("fox");
		
		printSet(hashSet);
		printSet(treeSet);
		
		hashSet.retainAll(treeSet);
		System.out.println("is: " + hashSet);
		
		hashSet.add("panda");
		hashSet.add("giraffe");
		hashSet.add("aardvark");
		
		System.out.println("\nDifference between:");
		printSet(hashSet);
		printSet(treeSet);
		
		hashSet.removeAll(treeSet);
		System.out.println("is: " + hashSet);

	}

	private static void populateSet(Set<String> set) {

		set.add("dog");
		set.add("cat");
		set.add("hamster");
		set.add("fox");
		set.add("squirrel");
		
		printSet(set);
	}
	
	private static void printSet(Set<String> set) {
		System.out.println(set.getClass().getSimpleName() + ": " + set);	
	}

}
