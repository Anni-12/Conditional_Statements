package July_19;

import java.util.ArrayList;
import java.util.*;
public class Reverse_ArrayList {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("red");
		arr.add("blue");
		arr.add(4);
		arr.add("hello");
		System.out.println("The array list before reversing is:-"+arr);
		Collections.reverse(arr);
		System.out.println("The array list after reversing is:-"+arr);

	}

}
