package LinkedList;

import java.util.LinkedList;

public class Question26 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("The linked list:-"+ll);
		ll.set(4, "hello");
		System.out.println("The updated Linked List:-"+ll);

	}

}
