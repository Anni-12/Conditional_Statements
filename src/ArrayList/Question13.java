package ArrayList;

import java.util.ArrayList;

public class Question13 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list 1 is:-"+arr1);
		ArrayList<String> arr2= new ArrayList<>();
		arr2.add("Red");
		arr2.add("Orange");
		arr2.add("Yellow");
		arr2.add("Black");
		System.out.println("The array list 2 is:-"+arr2);
		ArrayList<String> arr3= new ArrayList<>();
		for(String i:arr1)
		{
			if(arr2.contains(i))
			{
				arr3.add(i);
			}
		}
		System.out.println("The new list which has elements in both is:-"+arr3);
	}

}
