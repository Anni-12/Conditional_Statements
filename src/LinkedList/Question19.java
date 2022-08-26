package LinkedList;

import java.util.LinkedList;

public class Question19 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before Deleting:-"+ll);
		//ll.pop();
		System.out.println("the deleted element is:-"+ll.pop());
		System.out.println("The new linked list:-"+ll);

	}

}
