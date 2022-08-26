package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list before reverse is:-"+arr1);
		Collections.reverse(arr1);
		System.out.println("The array list after reverse is:-"+arr1);
	}

}
