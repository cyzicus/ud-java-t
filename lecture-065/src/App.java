import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = {
			"ambulance", "helicopter", "lifeboat"
	};
	
	public static String[][] drivers = {
			{"Fred", "Sue", "Pete"},
			{"Sue", "Richard", "Bob", "Fred"},
			{"Pete", "Mary", "Bob"}
	};
	
	public static void main(String[] args) {
		
		Map<String, Set<String>> personnel = new HashMap<>();

		for(int i = 0; i < vehicles.length; i++) {
			Set<String> driverSet = new LinkedHashSet<String>();
			for(String driver : drivers[i]) {
				driverSet.add(driver);
			}
			personnel.put(vehicles[i], driverSet);
		}
		
		System.out.println(personnel);
	}

}
