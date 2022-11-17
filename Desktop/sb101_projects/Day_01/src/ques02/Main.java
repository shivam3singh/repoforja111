package ques02;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	
	public static void main(String[] args) {
		
		
		
		Set<Employee> set= new TreeSet<>(new comp_empId());
		
		set.add(new Employee(1,"Shivam", "Delhi", 80000));
		set.add(new Employee(3,"Shiv", "London", 70000));
		set.add(new Employee(5,"Shivani", "America", 20000));
		set.add(new Employee(2,"Shivangi", "Paris", 90000));
		set.add(new Employee(4,"Shyam", "Canada", 50000));
		set.add(new Employee(6,"Ram", "Mumbai", 80000));
	
	
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("1.sort usid Id");
			System.out.println("2.sort the Employee using adress");
			System.out.println("3.sort using Salary");
			
			 int option= sc.nextInt();
			 if(option==1) {
					Set<Employee> set1= new TreeSet<>(new comp_empId());
					set1.addAll(set);
				System.out.println(set1);
				}
				if(option==2) {
					Set<Employee> set1= new TreeSet<>(new compSalary());
					set1.addAll(set);
					System.out.println(set1);
				}if(option==3) {
					Set<Employee> set1= new TreeSet<>(new empadd());
					set1.addAll(set);
					System.out.println(set1);
				}
			 
			System.out.println("Y/N");
			String s=sc.next();
			
			if(s.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		
		
		
		
		
	}
	
}

