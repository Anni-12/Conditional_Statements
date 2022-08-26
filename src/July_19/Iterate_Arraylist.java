package July_19;

import java.util.ArrayList;

public class Iterate_Arraylist {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("red");
		arr.add("blue");
		//arr.add(4);
		arr.add("hello");
		System.out.println("The array list is:-"+arr);
		for(Object i:arr)
		{
			System.out.println(i);
		}

	}

}
