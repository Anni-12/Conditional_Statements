package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Question8 {

	public static void main(String[] args) {
		HashSet<String> hash= new HashSet<String>();
		hash.add("Hello");
		hash.add("There");
		hash.add("Hey");
		hash.add("Okay");
		System.out.println("The hashSet is:-"+hash);
		TreeSet<String> h2t= new TreeSet<String>(hash);
		System.out.println("The Treeset is:-"+h2t);
	}

}
