package TreeSet;

import java.util.TreeSet;

public class Question2 {

	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("Hello");
		tree.add("There");
		tree.add("Hey");
		tree.add("Okay");
		System.out.println("The TreeSet is:-"+tree);
		for(String obj:tree)
		{
			System.out.println(obj);
		}

	}

}
