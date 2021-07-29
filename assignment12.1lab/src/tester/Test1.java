package tester;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test1 {
	public static void main(String[] args) {
		//1st question
		List<String> list = Arrays.asList("Avengers","Batman","Cat-woman");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
		//2nd question
		List<Double> list2 = Arrays.asList(10.2,23.4,56.8,45.5);
		System.out.println(list2);
		Collections.shuffle(list2);
		System.out.println(list2);
		
		display(new LinkedList<>(Arrays.asList(1,2,3,4,5)));
		System.out.println();
		display(new LinkedList<>(Arrays.asList("Avengers","Batman","Cat-woman")));
		

		display2(new LinkedList<>(Arrays.asList(1,2,3,4,5)));
		System.out.println();
		display2(new LinkedList<>(Arrays.asList("Avengers","Batman","Cat-woman")));
		
		//3.2 add the element
		Vector<Integer> v1 = new Vector<>(Arrays.asList(1,2,4));
		System.out.println("SUM="+sum(v1));
		HashSet<Double> h1 = new HashSet<>(Arrays.asList(1.1,2.0,3.25));	
		System.out.println("SUM = "+sum(h1));
	}
	//write own generics display method
	public static <T> void display(Collection<T> list) {
		for(T l : list)
		{
			System.out.println(l);
		}
	}
	//own generic display method using generics
	public static void display2(Collection<?> list) {
		Iterator<?> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
//	public static double sum(Collection<? extends Number> list) {
//		Iterator<? extends Number> itr = list.iterator();
//		double sum =0;
//		while(itr.hasNext())
//			sum+=itr.next().doubleValue();
//		return sum;
//	}
	
	public static<T extends Number> double sum(Collection<T> list) {
	double sum =0;
	for(T t:list)
		sum +=t.doubleValue();
	return sum;
}
}
