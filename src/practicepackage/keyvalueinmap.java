package practicepackage;

import java.util.HashMap;
import java.util.Set;

public class keyvalueinmap {

	public static void main(String[] args) {
		
		HashMap map= new HashMap();
		map.put("abc1", 1);
		map.put("abc2", 2);
		map.put("abc3", 3);
		map.put("abc4",4);
		System.out.println("size of map :"+map.size());
		System.out.println(map.containsKey("abc1"));
		System.out.println(map.containsKey("abc"));
		System.out.println(map.containsValue(4));
		map.remove("abc3");
		System.out.println(map.containsKey("abc3"));
		
		
		

	}

}
