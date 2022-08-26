package LinkedList;

import java.util.LinkedList;

public class Question10 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Linked List:-"+ll);
		System.out.println("The first element is:-"+ll.getFirst());
		System.out.println("The last element is:-"+ll.getLast());

	}

}
