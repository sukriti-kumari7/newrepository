package javaproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapProgram {

	public static void main(String[] args) {
		
		//HashMap
		
		Map<Integer,String> myMap = new HashMap<Integer,String>();		
		
		myMap.put(1,"Aprajita");
		myMap.put(2,"Anjali");
		myMap.put(3,"Aman");
		myMap.put(4,"Aaloc");
		myMap.put(5,"Aaditya");
		myMap.put(6,"Aparna");
		
		System.out.println(myMap);
		
		System.out.println(myMap.get(5));
		
		Set<Integer> set = myMap.keySet();
		
		System.out.println(set);
		
		Collection<String> values = myMap.values();
		
		System.out.println(values);
		
		System.out.println(myMap.containsKey(4));
		System.out.println(myMap.containsKey(8));
		
		//LinkedHashMap
		
		Map<Integer,Integer> mymap = new LinkedHashMap<Integer,Integer>();
		
		mymap.put(1,101);
		mymap.put(2,102);
		mymap.put(3,103);
		mymap.put(4,104);
		mymap.put(5,105);
		mymap.put(6,106);
		
		System.out.println(mymap);
		
		//TreeMap
		
		Map<Integer,Float> map = new TreeMap<Integer,Float>();
		
		map.put(601, 2.346f);
		map.put(402, 576.67f);
		map.put(803, 394.57f);
		map.put(904, 238.4587f);
		map.put(205, 3546.567f);
		map.put(506, 4785.689f);
		map.put(107, 596.798f);
		
		System.out.println(map);
		
	}

}
