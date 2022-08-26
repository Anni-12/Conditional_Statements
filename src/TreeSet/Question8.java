package TreeSet;

import java.util.TreeSet;

public class Question8 {

	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("Hello");
		tree.add("There");
		tree.add("Hey");
		tree.add("Okay");
		System.out.println("The TreeSet is:-"+tree);
		TreeSet<String> tree1= new TreeSet<String>();
		tree1.add("Hello");
		tree1.add("There");
		tree1.add("Hey");
		tree1.add("Ok");
		System.out.println("The TreeSet is:-"+tree1);
		TreeSet<String> tree2= new TreeSet<String>();
		for(String i:tree)
		{
			if(tree1.contains(i))
			{
				tree2.add(i);
			}
		}
		System.out.println("The new Treeset is:-"+tree2);

	}

}
