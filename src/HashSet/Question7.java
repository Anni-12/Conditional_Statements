package HashSet;

import java.util.HashSet;

public class Question7 {

	public static void main(String[] args) {
		HashSet<String> hash= new HashSet<String>();
		hash.add("Hello");
		hash.add("There");
		hash.add("Hey");
		hash.add("Okay");
		System.out.println("The hashSet is:-"+hash);
		String[] arr= new String[hash.size()];
		hash.toArray(arr);
		for(String i:arr)
		{
			System.out.println(i);
		}

	}

}
