package ArrayList;

import java.util.ArrayList;

public class Question18 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("The array list 1 is:-"+arr1);
		arr1.removeAll(arr1);
		if(arr1.isEmpty())
		{
			System.out.println("Yes it is empty");
		}
		else
		{
			System.out.println("No it is not empty");
		}

	}

}
