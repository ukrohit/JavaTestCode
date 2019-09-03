package com.example.java8;
@FunctionalInterface
public interface DefaultNStaticInterface {

	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

}
