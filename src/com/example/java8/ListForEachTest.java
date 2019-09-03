package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListForEachTest {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,2,3,2,3,3,3,3);

		list.forEach(System.out::print);
		
		Consumer<Integer> listConsumer=new Consumer<Integer>(){

			public void accept(Integer t) {System.out.println(t);
				
			}
			
		}; 
		
		list.forEach(listConsumer);
		
		
		list.forEach(t->System.out.print(t));
		
		
		
		

	}

}
