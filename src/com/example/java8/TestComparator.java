package com.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, null, 21));
		Comparator<Student> cm1 = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
	//	Collections.sort(al, new StudentNameComparator());
		Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
		//Collections.sort(al);
		System.out.println("Considers null to be less than non-null");
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		List<Student> slist=al.stream().filter(s->s.getAge()>=23).collect(Collectors.toList());
		for (Student student : slist) {

			System.out.println(student.getAge()+"--"+student.getRollno());
				
		}
		Comparator<Student> cm2 = Comparator.comparing(Student::getName, Comparator.nullsLast(String::compareTo));
		Collections.sort(al, cm2);
		System.out.println("Considers null to be greater than non-null");
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
