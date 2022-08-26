package LinkedList;

import java.util.LinkedList;

public class Question11 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before Adding:-"+ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("the element at "+(i+1)+" is "+ll.get(i));
		}

	}

}
