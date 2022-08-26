package ArrayList;

import java.util.ArrayList;

public class Question15 {

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
		ArrayList<String> arr3= new ArrayList<>();
		arr3.addAll(arr1);
		arr3.addAll(1,arr2);
		System.out.println("The new Array List is:-"+arr3);

	}

}
