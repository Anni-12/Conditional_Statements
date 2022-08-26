package LinkedList;

import java.util.LinkedList;

public class Question13_and_14 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before :-"+ll);
		ll.removeFirst();
		System.out.println("After deleting the first element:-"+ll);
		ll.removeLast();
		System.out.println("After deleting the Last element:-"+ll);
		
	}

}
