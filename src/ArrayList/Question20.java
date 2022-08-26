package ArrayList;

import java.util.ArrayList;

public class Question20 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The previous list is:-"+arr1);
		arr1.ensureCapacity(7);
		arr1.add("Blue");
		arr1.add("Black");
		arr1.add("Brown");
		System.out.println("The updated list is:-"+arr1);

	}

}
