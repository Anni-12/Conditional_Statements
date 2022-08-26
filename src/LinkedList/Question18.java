package LinkedList;

import java.util.LinkedList;

public class Question18 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("The normal one:-"+ll);
		LinkedList<Object> l2= new LinkedList<Object>();
		l2=(LinkedList)ll.clone();
		System.out.println("The cloned one:-"+l2);
		

	}

}
