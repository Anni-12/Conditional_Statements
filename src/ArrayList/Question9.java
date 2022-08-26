package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list 1 is:-"+arr1);
		ArrayList<String> arr2= new ArrayList<>();
		arr2.add("Black");
		arr2.add("Brown");
		arr2.add("Blue");
		arr2.add("Violet");
		System.out.println("The array list 2 is:-"+arr2);
		Collections.copy(arr1,arr2);
		System.out.println("The array list 1 after changes is:-"+arr1);
		System.out.println("The array list 2 after changes is:-"+arr2);
	}

}
