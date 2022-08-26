package ArrayList;

import java.util.ArrayList;

public class Question17 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list 1 is:-"+arr1);
		//ArrayList<String> arr2= (ArrayList<String>)arr1.clone();
		ArrayList<String> arr2= new ArrayList<>();
		arr2=(ArrayList)arr1.clone();
		System.out.println("The cloned array list is:-"+arr2);
		
	}

}
