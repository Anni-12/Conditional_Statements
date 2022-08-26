package LinkedList;

import java.util.LinkedList;
import java.util.ArrayList;
public class Question23 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		System.out.println("The linked list:-"+ll);
		ArrayList<Object> arr= new ArrayList<Object>(ll);
		for(Object k:arr)
		{
			System.out.println(k);
		}
		//System.out.println("The arraylist elements are:-"+);

	}

}
