package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list 1 is:-"+arr1);
		Collections.swap(arr1, 1, 3);
		System.out.println("The updated array list is:-"+arr1);

	}

}
