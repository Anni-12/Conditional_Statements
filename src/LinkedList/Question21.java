package LinkedList;

import java.util.LinkedList;

public class Question21 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before Adding:-"+ll);
		Object str= ll.peekLast();
		System.out.println("The last element is:-"+str);
		System.out.println("The output ll is:-"+ll);
		//System.out.println(ll.get(1));
	}

}
