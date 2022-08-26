package HashSet;

import java.util.HashSet;

public class Question10 {

	public static void main(String[] args) {
		HashSet<String> hash= new HashSet<String>();
		hash.add("Hello");
		hash.add("There");
		hash.add("Hey");
		hash.add("Okay");
		System.out.println("The hashSet 1 is:-"+hash);
		HashSet<String> hash1= new HashSet<String>();
		hash1.add("Hello");
		hash1.add("There");
		hash1.add("Hey");
		hash1.add("ok");
		System.out.println("The hashSet 2 is:-"+hash1);
		HashSet<String> hash2= new HashSet<String>();
		for(String i:hash)
		{
			if(hash1.contains(i))
			{
				hash2.add(i);
			}
		}
		System.out.println(hash2);

	}

}
