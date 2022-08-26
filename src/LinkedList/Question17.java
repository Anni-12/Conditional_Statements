package LinkedList;

import java.util.LinkedList;

public class Question17 {

	public static void main(String[] args) {
		LinkedList<Object> l1= new LinkedList<Object>();
		l1.add("hi");
		l1.add(3);
		l1.add("there");
		l1.add("okay");
		l1.add(4);
		System.out.println("List 1:-"+l1);
		LinkedList<Object> l2= new LinkedList<Object>();
		l2.add("OMG");
		l2.add("Project");
		System.out.println("List 2:-"+l2);
		LinkedList<Object> sum= new LinkedList<Object>();
		sum.addAll(l1);
		sum.addAll(1,l2);
		System.out.println("The new list is:-"+sum);
	}

}
