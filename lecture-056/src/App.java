import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();	
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer,  String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer,  String>();
		
		// Hashmaps aren't guaranteed to be in order (though often look like they are)
		testMap(hashMap);
		
		// LinkedHashMaps will always be in the order you enter them
		testMap(linkedHashMap);
		
		// TreeMaps will always be in the NATURAL order of the map (as
		// defined by the key itself or by the natural order you create for it
		testMap(treeMap);
	
	}
	
	private static void testMap(Map<Integer, String> map) {
		
		map.put(9, "fox");
		map.put(8, "squirrel");
		map.put(14, "cat");
		map.put(2, "dog");
		map.put(15, "hamster");
		map.put(7, "tiger");
		map.put(1, "wolf");
		map.put(3, "lion");
		
		System.out.println(map.getClass().getSimpleName() + ":");
		
		for(Integer key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println(""); 
	}

}
