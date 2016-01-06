import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		// ArrayList manages an array internally
		// [0][1][2][3][4][5]...
		List<Integer> arrayList = new ArrayList<Integer>();
		
		// LinkedList consists of elements where each element
		// merely POINTS to a reference of the object
		// [0]->[1]->[2]...
		//    <-   <-
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings(arrayList);
		doTimings(linkedList);
		
	}
	
	private static void doTimings(List<Integer> list) {
		
		for(int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// ArrayLists are very fast when adding or removing from the end of the list
//		// Adding items at the end of list
//		for(int i = 0; i < 1E5; i++) {
//			list.add(i);
//		}
		
		// Add items elsewhere in list
		// ArrayLists are a lot slower because they have to manage
		// the array...moving items following the item that is added or removed
		for(int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis();
		
		String type = list.getClass().getSimpleName();
		long totalMs = end - start;
		
		System.out.println("Time taken: " + totalMs + " ms for " + type);
	}

}
