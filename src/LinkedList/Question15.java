package LinkedList;

import java.util.LinkedList;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {

		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("Before :-"+ll);
		Collections.swap(ll, 1, 3);
		System.out.println("After swapping:-"+ll);

	}

}
