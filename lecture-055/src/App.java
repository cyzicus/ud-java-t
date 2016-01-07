import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		// A hashmap does NOT maintain order!
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(4, "Four");
		map.put(9, "Nine");
		map.put(2, "Two");
		
		// A second entry with the same key just overwrites the first value
		map.put(4, "Hello");
		
		String text = map.get(4);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}

}
