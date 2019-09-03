package com.example.java8;

public class ThreadClass {
	
	Runnable r = new Runnable(){
		@Override
		public void run() {
			System.out.println("My Runnable");
		}};
		
		
		Runnable r1=()->System.out.println("My Runnable");

}
