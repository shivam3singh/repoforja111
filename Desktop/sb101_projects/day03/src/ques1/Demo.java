package ques1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
	
		
		List<product> l1= new ArrayList<>();
		
		l1.add(new product(1,"car",1,50));
		
		l1.add(new product(2,"chattered_plane",1,60));
		
		l1.add(new product(3,"rollsroyce",15,70));
		
		l1.add(new product(4,"bike",18,80));
		
		l1.add(new product(5,"horse",16,90));
		
		
		Stream<product> str=l1.stream();
		
		List<product>  filtered_list=str.filter((p)->p.getQuantity()>10).collect(Collectors.toList());
		
		//
		
		Collections.sort(filtered_list,(o1,o2)->o1.getPrice()>o2.getPrice()?-1:1);
		filtered_list.forEach((p)->System.out.println(p));
		System.out.println("+=================+");
		l1.forEach((p)->System.out.println(p));
		
	}
}
