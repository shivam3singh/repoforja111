package ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class Main {

	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Shivam", 10));
		
		list.add(new Student(1, "Shiva", 10));
		
		
		list.add(new Student(3, "Shivram", 40));
		list.add(new Student(4, "Shivagi", 10));
		list.add(new Student(5, "Shivani", 60));
		
	Optional<Student> opt=list.stream().max((o1,o2)->o1.getMarks()>o2.getMarks()?1:-1);
	
	Student s= opt.get();
	System.out.println(s);
		
		
	}
}
