package ArrayList;

import java.util.ArrayList;

public class Question21 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list is:-"+arr1);
		arr1.set(0,"Blue");
		System.out.println("The updated list is:-"+arr1);

	}

}
