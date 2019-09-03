package com.example.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l= Arrays.asList(1,2,3,4);
		
		System.out.println(l);
				
		// collect terminal in stream
		List<Integer> squreL=l.stream().map(e->e*e*e).collect(Collectors.toList());
		
		// for each terminal in stream
		l.stream().map(e->e*e*e).forEach(e->System.out.print(e));
		
		// reduce terminal in stream 
		int even = squreL.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

		int odd=squreL.stream().filter(x->x%0!=0).reduce(0, (ans,i)->ans+i);
		
		System.out.println(squreL);

		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		//List names = Arrays.asList("Reflection","Collection","Stream");
		List<String> sortresult = names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortresult);

		// intermediate operation in stream are map filter and sorted 
		
		
	}

}
