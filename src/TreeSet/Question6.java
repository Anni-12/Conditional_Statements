package TreeSet;

import java.util.TreeSet;

public class Question6 {

	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("Hello");
		tree.add("There");
		tree.add("Hey");
		tree.add("Okay");
		System.out.println("The TreeSet is:-"+tree);
		TreeSet<String> tree1= (TreeSet<String>)tree.clone();
		System.out.println("the cloned treeset is:-"+tree1);

	}

}
