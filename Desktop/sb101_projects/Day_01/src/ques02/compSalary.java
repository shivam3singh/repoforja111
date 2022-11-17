package ques02;

import java.util.Comparator;

public class compSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
	   if(o1.getSalary()>o2.getSalary()) return 1;
	   else if(o2.getSalary()<o2.getSalary()) return -1;
	   return o1.getName().compareTo(o2.getName());
	   
	}

}
