package LinkedList;

import java.util.LinkedList;

public class Question9 {

	public static void main(String[] args) {

		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before Adding:-"+ll);
		LinkedList<Object> ll1= new LinkedList<Object>();
		ll1.add("new");
		ll1.add("here");
		ll1.add("there");
		ll.addAll(1,ll1);
		System.out.println("After Adding:-"+ll);

	}

}
