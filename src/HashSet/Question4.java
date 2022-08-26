package HashSet;

import java.util.HashSet;

public class Question4 {

	public static void main(String[] args) {
		HashSet<String> hash= new HashSet<String>();
		hash.add("Hello");
		hash.add("There");
		hash.add("Hey");
		hash.add("Okay");
		System.out.println("The hashSet is:-"+hash);
		hash.clear();
		System.out.println("The empty hashset:-"+hash);
	}

}
