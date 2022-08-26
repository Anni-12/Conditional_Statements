package HashSet;

import java.util.HashSet;

public class Question5 {

	public static void main(String[] args) {
		HashSet<String> hash= new HashSet<String>();
		hash.add("Hello");
		hash.add("There");
		hash.add("Hey");
		hash.add("Okay");
		System.out.println("The hashSet is:-"+hash);
		hash.clear();
		if(hash.isEmpty())
		{
			System.out.println("The hash is empty");
		}
		else
		{
			System.out.println("The hash is not empty");
		}

	}

}
