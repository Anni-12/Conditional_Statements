package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Question4 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		Iterator it = ll.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
