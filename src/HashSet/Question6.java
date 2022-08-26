package HashSet;

import java.util.HashSet;

public class Question6 {

	public static void main(String[] args) {
		HashSet<String> hash= new HashSet<String>();
		hash.add("Hello");
		hash.add("There");
		hash.add("Hey");
		hash.add("Okay");
		System.out.println("The hashSet 1 is:-"+hash);
		HashSet<String> hash2= (HashSet)hash.clone();
		System.out.println("The cloned hashset is:-"+hash2);

	}

}
