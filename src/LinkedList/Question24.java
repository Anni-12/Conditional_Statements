package LinkedList;

import java.util.LinkedList;

public class Question24 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("The linked list:-"+ll);
		LinkedList<Object> l2= new LinkedList<Object>();
		l2.add("hi");
		l2.add(3);
		l2.add("there");
		l2.add("okay");
		//ll.add(4);
		System.out.println("The linked list 2:-"+l2);
		LinkedList<Object> main= new LinkedList<Object>();
		for(Object i:ll)
		{
			if(l2.contains(i))
			{
				main.add(i);
			}
		}
		System.out.println("The main Linked List is:-"+main);

	}

}
