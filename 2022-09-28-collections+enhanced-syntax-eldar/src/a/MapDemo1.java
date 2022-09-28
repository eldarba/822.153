package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(1, "one");
		map1.put(2, "two");
		map1.put(3, "three");
		System.out.println(map1);
		
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		
		map1.put(2, "shtaiim");
		System.out.println(map1);
		
		System.out.println("===============");
		Map<String, String> map2 = new TreeMap<>();
		map2.put("table", "a furniture with 4 legs");
		map2.put("apple", "a sweet fruite");
		map2.put("java", "a programming language");
		map2.put("java script", "a programming language");
		System.out.println(map2);
		
		System.out.println("table: " + map2.get("table"));
		
		System.out.println(map2.containsKey("aaa"));
		System.out.println(map2.containsKey("java"));
		
		// get the map keys
		Set<String> words = map2.keySet();
		System.out.println(words);

		// get the map values
		Collection<String> definitions = map2.values();
		System.out.println(definitions);
		
		// if you want the collection as list use the constructor of the desired List
		List<String> definitionsAsList = new ArrayList<>(map2.values());
	}

}
