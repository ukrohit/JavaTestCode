package com.example.java8;

public class ReverseString {
	
	private static final String uname= "POP";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reversestr="";
		for (int i = uname.length()-1; i >= 0; i--) {
			reversestr+=uname.charAt(i);
			System.out.println(reversestr);
		}
		
	}

}
