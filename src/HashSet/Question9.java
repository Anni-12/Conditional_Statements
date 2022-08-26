package HashSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class Question9 {

	public static void main(String[] args) {
		HashSet<String> hash= new HashSet<String>();
		hash.add("Hello");
		hash.add("There");
		hash.add("Hey");
		hash.add("Okay");
		System.out.println("The hashSet is:-"+hash);
		ArrayList<String> arr= new ArrayList<String>(hash);
		for(String i:arr)
		{
			System.out.println(i);
		}

	}

}
