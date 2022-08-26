package ArrayList;

import java.util.ArrayList;

public class Question22 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		for(int i=0;i<arr1.size();i++)
		{
			System.out.println((i+1)+":-"+arr1.get(i));
		}
	}

}
