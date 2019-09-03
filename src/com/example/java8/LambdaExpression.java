package com.example.java8;

import java.util.Arrays;
import java.util.List;


public class LambdaExpression {
	

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers.forEach(n->System.out.print(n));
		
		
		numbers.stream().mapToInt(n->n).sum();
		
		
		numbers.stream().mapToInt(i->i.intValue()).sum();
		
		numbers.stream().mapToInt(Integer::intValue).sum();
		
	}
	

	
	

}
