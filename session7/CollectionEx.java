package session7;

 import java.util.*;
 
public class CollectionEx {
	
	//adding and accessing elements in a collection
	
	public static void main(String[] args) {
		//list Example 
		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("Node");
		
		System.out.println("List: "+list);
		
		//set Example
		
		Set<String> set = new HashSet<>();
		
		set.add("Duke390");
		set.add("Ns200");
		set.add("Royal Enfield");
		
		System.out.println("Set: "+set);
		
		//Map  Example
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Hema");
		map.put(2, "shobana");
		map.put(3, "Giridas");
		
		System.out.println("Map: "+map);
				
		
		
	}

}
