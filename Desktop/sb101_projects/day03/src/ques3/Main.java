package ques3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,2,3,4);
		
//		Stream<Integer> str=l.stream();
//		
//		Stream<Integer> str2=str.map(i->i*i);
//		
//		List<Integer> l2=str2.collect(Collectors.toList());
	
		//l.forEach(s->System.out.println(s));
		
		List<Integer> op=l.stream().map(p->p*p).collect(Collectors.toList());
		
		op.forEach(System.out::println);
		System.out.println("============");
		l.forEach(s->System.out.println(s));
		
		
		
		
	}
}
