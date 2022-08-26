package LinkedList;

import java.util.LinkedList;

public class Question22 {

	public static void main(String[] args) {

		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("The Linked List:-"+ll);
		if(ll.contains("okay"))
		{
			System.out.println("Okay is there");
		}
		else
		{
			System.out.println("Okay is Not there");
		}

	}

}
