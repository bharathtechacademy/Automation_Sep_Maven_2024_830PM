package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsConcepts {
	
	
	//Array ==> to store multiple values with same data type together in same memory location
	
	//Challenges with array
	
	//1. Arrays are fixed in length
	//2. Array allows similar data types only
	//3. Array follows static memory allocation
	//4. Arrays won't allow modifications
	
	// DataType [] variable = new DataType [size] ;
	// variable[Index] = Value;
	// variable.length;
	
	
	//Collections Framework ==> 
	
	//List ==> ArrayList , LinkedList (the way we are going to store values in memory)
	//	1.List can store multiple values with same data type together 
	//	2.List follow dynamic memory allocation
	//  3.List allow modifications
	//  4.List allow duplicates
	
	
	//Set ==> HashSet, LinkedHashSet , TreeSet  (order of storing values, storing null values)
	//	1.Set can store multiple values with same data type together 
	//	2.Set follow dynamic memory allocation
	//  3.Set allow modifications
	//	4.Set won't allow duplicates
	
	//Map ==> HashMap, LinkedHashMap, TreeMap and Hashtable (order of storing keys, storing null values)
	//	1.Map can store multiple values with different data types together in the form of key and value 
	//	2.Map follow dynamic memory allocation
	//  3.Map allow modifications
	//	4.Map won't allow duplicate keys but duplicate values allowed
	
	//Hash ==> Random
	//Link ==> Insertion
	//Tree ==> Ascending

	public static void main(String[] args) {
		
//		int empId = 1234;
//		double area = 765.34;
//		
//		List<Integer> empIdsArrayList = new ArrayList<Integer>();
//		empIdsArrayList.add(1234);
		
		/*********************ArrayList****************/
		System.out.println("**********ArrayList*********");
		
		//Syntax to initialize : List<DataType> variable = new ArrayList<DataType>();
		//Syntax to store value : variable.add(value);
		//Syntax to access value : variable.get(Index);
		//Syntax to remove value : variable.remove(value);
		//Syntax to get size : variable.size();
		
		//null values : allowed
		//order of storing values : Insertion order
		//duplicate values : allowed
		
		List<String> empNamesArrayList = new ArrayList<String>();		
		empNamesArrayList.add("Sravan");
		empNamesArrayList.add("Chinnu");
		empNamesArrayList.add("Ravali");
		empNamesArrayList.add("Sravan");
		empNamesArrayList.add("Sanjay");
		empNamesArrayList.add("Teja");
		empNamesArrayList.add(null);
		empNamesArrayList.add(2,"Kshitija");
		empNamesArrayList.remove("Teja");
		System.out.println(empNamesArrayList.size());
		System.out.println(empNamesArrayList.get(1));
		System.out.println(empNamesArrayList);
		
		/*********************LinkedList****************/
		System.out.println("**********LinkedList*********");
		
		//Syntax to initialize : List<DataType> variable = new LinkedList<DataType>();
		//Syntax to store value : variable.add(value);
		//Syntax to access value : variable.get(Index);
		//Syntax to remove value : variable.remove(value);
		//Syntax to get size : variable.size();
		
		//null values : allowed
		//order of storing values : Insertion order
		//duplicate values : allowed
		
		List<String> empNamesLinkedList = new LinkedList<String>();		
		empNamesLinkedList.add("Sravan");
		empNamesLinkedList.add("Chinnu");
		empNamesLinkedList.add("Ravali");
		empNamesLinkedList.add("Sravan");
		empNamesLinkedList.add("Sanjay");
		empNamesLinkedList.add("Teja");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("Teja");
		System.out.println(empNamesLinkedList.size());
		System.out.println(empNamesLinkedList.get(1));
		System.out.println(empNamesLinkedList);
		
		
		/*********************HashSet****************/
		System.out.println("**********HashSet*********");
		
		//Syntax to initialize : Set<DataType> variable = new HashSet<DataType>();
		//Syntax to store value : variable.add(value);

		//Syntax to remove value : variable.remove(value);
		//Syntax to get size : variable.size();
		
		//null values : allowed
		//order of storing values : Random order
		//duplicate values : not allowed
		
		Set<String> empNamesHashSet = new HashSet<String>();		
		empNamesHashSet.add("Sravan");
		empNamesHashSet.add("Chinnu");
		empNamesHashSet.add("Ravali");
		empNamesHashSet.add("Sravan");
		empNamesHashSet.add("Sanjay");
		empNamesHashSet.add("Teja");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Teja");
		System.out.println(empNamesHashSet.size());
//		System.out.println(empNamesHashSet.get(1));
		System.out.println(empNamesHashSet);
		
		/*********************LinkedHashSet****************/
		System.out.println("**********LinkedHashSet*********");
		
		//Syntax to initialize : Set<DataType> variable = new LinkedHashSet<DataType>();
		//Syntax to store value : variable.add(value);

		//Syntax to remove value : variable.remove(value);
		//Syntax to get size : variable.size();
		
		//null values : allowed
		//order of storing values : Insertion order
		//duplicate values : not allowed
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();		
		empNamesLinkedHashSet.add("Sravan");
		empNamesLinkedHashSet.add("Chinnu");
		empNamesLinkedHashSet.add("Ravali");
		empNamesLinkedHashSet.add("Sravan");
		empNamesLinkedHashSet.add("Sanjay");
		empNamesLinkedHashSet.add("Teja");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Teja");
		System.out.println(empNamesLinkedHashSet.size());
//		System.out.println(empNamesLinkedHashSet.get(1));
		System.out.println(empNamesLinkedHashSet);
		
		/*********************TreeSet****************/
		System.out.println("**********TreeSet*********");
		
		//Syntax to initialize : Set<DataType> variable = new TreeSet<DataType>();
		//Syntax to store value : variable.add(value);

		//Syntax to remove value : variable.remove(value);
		//Syntax to get size : variable.size();
		
		//null values : not allowed
		//order of storing values : Ascending order
		//duplicate values : not allowed
		
		Set<String> empNamesTreeSet = new TreeSet<String>();		
		empNamesTreeSet.add("Sravan");
		empNamesTreeSet.add("Chinnu");
		empNamesTreeSet.add("Ravali");
		empNamesTreeSet.add("Sravan");
		empNamesTreeSet.add("Sanjay");
		empNamesTreeSet.add("Teja");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Teja");
		System.out.println(empNamesTreeSet.size());
//		System.out.println(empNamesTreeSet.get(1));
		System.out.println(empNamesTreeSet);
		
		
		/*********************HashMap****************/
		System.out.println("**********HashMap*********");
		
		//Syntax to initialize : Map<Key, Value> variable = new HashMap<DataType,DataType>();
		//Syntax to store value : variable.put(key, value);
		//Syntax to remove value : variable.remove(key);
		//Syntax to get size : variable.size();		
		
		//null values : allowed
		//null keys : allowed
		//order of storing values : Random order of keys
		//duplicate values : allowed
		//duplicate keys : not allowed
		
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();		
		empNamesHashMap.put("Sravan",1234);
		empNamesHashMap.put("Chinnu",1235);
		empNamesHashMap.put("Ravali",1235);
		empNamesHashMap.put("Sravan",1237);
		empNamesHashMap.put("Sanjay",null);
		empNamesHashMap.put("Teja",1239);
		empNamesHashMap.put(null, 1240);
		empNamesHashMap.remove("Teja");
		System.out.println(empNamesHashMap.size());
		System.out.println(empNamesHashMap.get("Ravali"));
		System.out.println(empNamesHashMap);
		
		/*********************LinkedHashMap****************/
		System.out.println("**********LinkedHashMap*********");
		
		//Syntax to initialize : Map<Key, Value> variable = new LinkedHashMap<DataType,DataType>();
		//Syntax to store value : variable.put(key, value);
		//Syntax to remove value : variable.remove(key);
		//Syntax to get size : variable.size();		
		
		//null values : allowed
		//null keys : allowed
		//order of storing values : Insertion order of keys
		//duplicate values : allowed
		//duplicate keys : not allowed
		
		Map<String,Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();		
		empNamesLinkedHashMap.put("Sravan",1234);
		empNamesLinkedHashMap.put("Chinnu",1235);
		empNamesLinkedHashMap.put("Ravali",1235);
		empNamesLinkedHashMap.put("Sravan",1237);
		empNamesLinkedHashMap.put("Sanjay",null);
		empNamesLinkedHashMap.put("Teja",1239);
		empNamesLinkedHashMap.put(null, 1240);
		empNamesLinkedHashMap.remove("Teja");
		System.out.println(empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap.get("Ravali"));
		System.out.println(empNamesLinkedHashMap);
		
		/*********************TreeMap****************/
		System.out.println("**********TreeMap*********");
		
		//Syntax to initialize : Map<Key, Value> variable = new TreeMap<DataType,DataType>();
		//Syntax to store value : variable.put(key, value);
		//Syntax to remove value : variable.remove(key);
		//Syntax to get size : variable.size();		
		
		//null values : allowed
		//null keys : not allowed
		//order of storing values : Ascending order of keys
		//duplicate values : allowed
		//duplicate keys : not allowed
		
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();		
		empNamesTreeMap.put("Sravan",1234);
		empNamesTreeMap.put("Chinnu",1235);
		empNamesTreeMap.put("Ravali",1235);
		empNamesTreeMap.put("Sravan",1237);
		empNamesTreeMap.put("Sanjay",null);
		empNamesTreeMap.put("Teja",1239);
//		empNamesTreeMap.put(null, 1240);
		empNamesTreeMap.remove("Teja");
		System.out.println(empNamesTreeMap.size());
		System.out.println(empNamesTreeMap.get("Ravali"));
		System.out.println(empNamesTreeMap);
		
		/*********************Hashtable****************/
		System.out.println("**********Hashtable*********");
		
		//Syntax to initialize : Map<Key, Value> variable = new Hashtable<DataType,DataType>();
		//Syntax to store value : variable.put(key, value);
		//Syntax to remove value : variable.remove(key);
		//Syntax to get size : variable.size();		
		
		//null values : not allowed
		//null keys : not allowed
		//order of storing values : Random order of keys
		//duplicate values : allowed
		//duplicate keys : not allowed
		
		Map<String,Integer> empNamesHashtable = new Hashtable<String,Integer>();		
		empNamesHashtable.put("Sravan",1234);
		empNamesHashtable.put("Chinnu",1235);
		empNamesHashtable.put("Ravali",1235);
		empNamesHashtable.put("Sravan",1237);
//		empNamesHashtable.put("Sanjay",null);
		empNamesHashtable.put("Teja",1239);
//		empNamesHashtable.put(null, 1240);
		empNamesHashtable.remove("Teja");
		System.out.println(empNamesHashtable.size());
		System.out.println(empNamesHashtable.get("Ravali"));
		System.out.println(empNamesHashtable);
		
		
		Map<Integer, List<String>> map = new Hashtable<Integer,List<String>>();
		map.put(1234, empNamesArrayList);
		System.out.println(map);
	
	}

}
