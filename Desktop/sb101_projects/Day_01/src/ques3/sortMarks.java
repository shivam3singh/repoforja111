package ques3;

import java.util.Comparator;

import ques02.Employee;

public class sortMarks implements Comparator<Student> {

	
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
		   if(o1.getMarks()>o2.getMarks()) return 1;
		   else if(o2.getMarks()<o2.getMarks()) return -1;
		   return o1.getName().compareTo(o2.getName());
		   
		}

		
	

}
