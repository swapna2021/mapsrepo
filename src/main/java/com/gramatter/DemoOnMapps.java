package com.gramatter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



import java.util.Set;
import java.util.TreeMap;

public class DemoOnMapps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(11, "Mohan");
		map.put(9, "sruthi");
		map.put(23, "swetha");
		System.out.println(map);
		System.out.println(map.get(11));
		System.out.println(map.keySet());
		System.out.println(map.values());
//		map.put(null, "abc");
//		System.out.println(map);
//		System.out.println(map.get(null));
		map.put(4,"swapna");
		map.put(6, "swathi");
		System.out.println(map);
		
		Set<Entry<Integer, String>> entSet= map.entrySet();
		Iterator<Entry<Integer, String>> itr=entSet.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next().getKey());
		
		
		Employee e1=new Employee("Swapna",123,50000,"Hyderabad");
		Employee e7=new Employee("Swapna",123,70000,"Hyderabad");
		Employee e8=new Employee("Swapna",123,90000,"Hyderabad");
		Employee e2=new Employee("Amit",234,90000,"Hyderabad");
		Employee e3=new Employee("Pooja",12,70000,"Delhi");
		Employee e4=new Employee("Kriti",34,60000,"Hyderabad");
		Employee e5=new Employee("Mohan",23,30000,"Delhi");
		Employee e6=new Employee("Preeti",2341,90000,"Delhi");
		
		TreeMap<Integer, Employee> treeMap=new TreeMap<Integer, Employee>();
		treeMap.put(1, e1);
		treeMap.put(2, e2);
		treeMap.put(3, e3);
		treeMap.put(7, e7);
		treeMap.put(8, e8);
		treeMap.put(4, e4);
		treeMap.put(5, e5);
		treeMap.put(6, e6);
		for(Entry<Integer,Employee> e:treeMap.entrySet())
		System.out.println(e);
		
		TreeMap<Employee,Address> myMap=new TreeMap<Employee, Address>();
		
		Address add1=new Address("Hyd","Telangana");
		Address add2=new Address("Hyd","Telangana");
		myMap.put(e1,add1);
		myMap.put(e2, add2);
		myMap.put(e3,add2);
		
		System.out.println("**********************");
		for(Entry<Employee,Address> e:myMap.entrySet())
			System.out.println(e);	

	}

}
