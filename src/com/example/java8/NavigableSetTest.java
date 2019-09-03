package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NavigableSetTest {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,2,3,2,3,3,3,3);
		
		Set<Integer> slist=new HashSet<>(list);
		
		Set<Integer> s2set=new TreeSet<>();
		
		s2set=list.stream().sorted().collect(Collectors.toSet());
		
		NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(0); 
        ns.add(1); 
        ns.add(2); 
        ns.add(3); 
        ns.add(4); 
        ns.add(5); 
        ns.add(6); 
  
        // Get a reverse view of the navigable set 
        NavigableSet<Integer> reverseNs = ns.descendingSet(); 
  
        // Print the normal and reverse views 
        System.out.println("Normal order: " + ns); 
        System.out.println("Reverse order: " + reverseNs); 
  
        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true); 
        System.out.println("3 or  more:  " + threeOrMore); 
        System.out.println("lower(3): " + ns.lower(3)); 
        System.out.println("floor(3): " + ns.floor(3)); 
        System.out.println("higher(3): " + ns.higher(3)); 
        System.out.println("ceiling(3): " + ns.ceiling(3)); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollLast(): " + ns.pollLast()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("pollLast(): " + ns.pollLast());

	}

}
