package ArrayList;

import java.util.ArrayList;

public class Question19 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		//arr1.add("Green");
		//arr1.add(" ");
		System.out.println("The array list 1 is:-"+arr1);
		arr1.ensureCapacity(4);
		System.out.println(arr1);
		//arr1.trimToSize();
		System.out.println("The trimmed array list is:-"+arr1);

	}

}
