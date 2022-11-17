package ques3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Shivam", "Sarsena", 10));
		
		list.add(new Student(1, "Shivam", "Sarsena", 10));
		
		
		list.add(new Student(3, "Shivram", "sena", 40));
		list.add(new Student(4, "Shivagi", "mau", 10));
		list.add(new Student(5, "Shivani", "chhapea", 60));
		
		Collections.sort(list,new sortMarks());
		
		System.out.println(list);
	}
	
}
