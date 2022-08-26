package LinkedList;

import java.util.LinkedList;

public class Question6 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before Adding:-"+ll);
		ll.addFirst("QA");
		System.out.println("After Adding at start:-"+ll);
		ll.addLast("hello");
		System.out.println("After adding at last"+ll);

	}

}
