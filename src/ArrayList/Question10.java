package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Red");
		arr1.add("Orange");
		arr1.add("Yellow");
		arr1.add("Green");
		System.out.println("Before Shuffing:-"+arr1);
		Collections.shuffle(arr1);
		System.out.println("After Shuffling:-"+arr1);

	}

}
