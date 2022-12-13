package ques4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	
	public static void main(String[] args) {
		
		Set<Student> s= new HashSet<>();
		
		s.add(new Student(1,"Shivam",10));
		s.add(new Student(2,"Shiva",1000));
		s.add(new Student(3,"Shivangi",1930));
		s.add(new Student(4,"Shyam",140));
		s.add(new Student(5,"Sima",150));
		s.add(new Student(1,"Shivam",10));
		
	List<Student>	l1=s.stream().filter(i->i.getMarks()>500).collect(Collectors.toList());
		
	Set<Student> op= new HashSet<>(l1);
	
	op.forEach(i->System.out.println(i));
		
	}
}
