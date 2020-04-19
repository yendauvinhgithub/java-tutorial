package java9.collections;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<String> set = Set.of("A","B","C");
		System.out.println(set);
		//set.add("D");
		List<String> list = List.of("A","B","C");
		System.out.println(list);
		//list.add("D");
		Map<String, String> map = Map.of("A","Apple","B","Boy","C","Cat");
		System.out.println(map);
		//map.put("D", "Dog");
		Map<String, String> map1 = Map.ofEntries (
		         new AbstractMap.SimpleEntry<>("A","Apple"),
		         new AbstractMap.SimpleEntry<>("B","Boy"),
		         new AbstractMap.SimpleEntry<>("C","Cat"));
		      System.out.println(map1);
		map1.put("D", "Door");
	}

}
