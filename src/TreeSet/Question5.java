package TreeSet;

import java.util.TreeSet;

public class Question5 {

	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("Hello");
		tree.add("There");
		tree.add("Hey");
		tree.add("Okay");
		System.out.println("The TreeSet is:-"+tree);
		System.out.println("The first element is:-"+tree.first());
		System.out.println("The last element is:-"+tree.last());
	}

}
