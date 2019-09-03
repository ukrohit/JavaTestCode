package com.demo.test;

import java.math.BigDecimal;

public class CurrencyCodeTest {
	
	public static void main(String[] args) {
		
		BigDecimal result=new BigDecimal("1.00").divide(new BigDecimal("3.00"));
		
		
		
		System.out.println(result);
		
		 System.out.println(new BigDecimal(1.03).subtract(new BigDecimal(0.41)));
		 System.out.println(new BigDecimal("1.03").subtract(new BigDecimal("0.41")));
	
	}
}
