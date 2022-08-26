package TreeSet;

import java.util.TreeSet;

public class Question3 {

	public static void main(String[] args) {
		TreeSet<String> tree1= new TreeSet<String>();
		tree1.add("Hello");
		tree1.add("There");
		tree1.add("Hey");
		tree1.add("Okay");
		System.out.println("The TreeSet 1 is:-"+tree1);
		TreeSet<String> tree2= new TreeSet<String>();
		tree2.add("row");
		tree2.add("are");
		tree2.add("here");
		tree2.add("Ok");
		System.out.println("The TreeSet 2 is:-"+tree2);
		//TreeSet<String> tree3= new TreeSet<String>();
		tree1.addAll(tree2);
		System.out.println("The updated treeset 1:-"+tree1);
	}

}
