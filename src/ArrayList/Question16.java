package ArrayList;

import java.util.ArrayList;

public class Question16 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list 1 is:-"+arr1);
		arr1.removeAll(arr1);
		System.out.println("The new list is:-"+arr1);

	}

}
