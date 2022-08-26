package ArrayList;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<>();
		arr.add("Red");
		arr.add("Orange");
		arr.add("Yellow");
		arr.add("Green");
		System.out.println("The array list is:-"+arr);
		arr.add(0,"Black");
		System.out.println("The updated array list is:-"+arr);
	}

}
