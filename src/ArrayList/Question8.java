package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<>();
		arr.add("Red");
		arr.add("Orange");
		arr.add("Yellow");
		arr.add("Green");
		System.out.println("The array list is:-"+arr);
		Collections.sort(arr);
		System.out.println("The sorted array list is:-"+arr);
	}

}
