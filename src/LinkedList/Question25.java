package LinkedList;

import java.util.LinkedList;

public class Question25 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("The linked list:-"+ll);
		ll.clear();
		if(ll.isEmpty())
		{
			System.out.println("Yes it is Empty");
		}
		else
		{
			System.out.println("No it is not empty");
		}

	}

}
