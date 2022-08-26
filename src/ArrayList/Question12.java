package ArrayList;

import java.util.ArrayList;

public class Question12 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		arr1.add("Black");
		System.out.println("The array list is:-"+arr1);
		System.out.println("The sub array list is:-"+arr1.subList(0, 4));
	}

}
