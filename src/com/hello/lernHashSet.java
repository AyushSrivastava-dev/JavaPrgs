package com.hello;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class lernHashSet {
	public static void main(String args[]) {
		Set<Integer> student = new LinkedHashSet<>();
		student.add(5);
		student.add(6);
		student.add(8);
		student.add(7);
		student.add(5);
		
		student.remove(6);
		if(student.contains(5)) {
			System.out.println("Yes");
		}
		System.out.print(student);
	}
}
