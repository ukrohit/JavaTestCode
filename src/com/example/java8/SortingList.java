package com.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList {

	/*
	 * List<Integer> arl=new ArrayList<>();
	 * 
	 * for(int i : a1) { arl.add(i); System.out.println("Arraylist contains:" +
	 * arl.get(0)); }
	 */
	public static void main(String[] args) {
		int a1[] = { 1, 2, 6, 3, 9, 5, 3, 8, 4, 7 };
		System.out.println("Un Sorting number");

		List<Integer> unsortList=new ArrayList<>();
		for(int a:a1)
		{
			unsortList.add(a);
			System.out.println(a);
		}
		
		System.out.println("Un Sorting list number");
		

//		unsortList.stream().filter(e->e>3).collect(Collectors.toList());
		
	//		unsortList.forEach(e->System.out.print(e));

		unsortList.forEach(System.out::println);
		
		for (int i = 0; i < a1.length; i++) {

			for (int j = i; j < a1.length; j++) {

				int temp;
				if (a1[i] <= a1[j]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}

			}

		}
		
		/*for (int i = 0; i < unsortList.size(); i++) {
			
			for (int j = i; j <unsortList.size(); j++) {
				int temp;
				
				if(unsortList.get(i).compareTo(unsortList.get(j))<=0)
				{
					temp=unsortList.get(i);
					unsortList.add(i,unsortList.get(j));
					unsortList.add(j,temp);
				}
			}
			
			
		}
		*/
		System.out.println("Sorting List Number");
		
		unsortList.forEach(i->System.out.println(i));
		
		
		System.out.println("Sorting number");
		for(int a:a1)
		{
			System.out.println(a);
		}

	}

}
