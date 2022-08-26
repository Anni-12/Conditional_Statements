package ArrayList;

import java.util.ArrayList;

public class Question7 {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<>();
		arr.add("Red");
		arr.add("Orange");
		arr.add("Yellow");
		arr.add("Green");
		System.out.println("The array list is:-"+arr);
		if(arr.contains("Black"))
		{
			System.out.println("Black is there");
		}
		else
		{
			System.out.println("No Black is not there");
		}

	}

}
