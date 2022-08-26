package LinkedList;

import java.util.LinkedList;

public class Question5 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before Adding:-"+ll);
		ll.add(4,"QA");
		System.out.println("After Adding:-"+ll);
	}

}
