package TreeSet;

import java.util.TreeSet;

public class Question12 {

	public static void main(String[] args) {
		TreeSet<Integer> tree1= new TreeSet<Integer>();
		tree1.add(7);
		tree1.add(4);
		tree1.add(3);
		tree1.add(8);
		tree1.add(2);
		TreeSet<Integer> tree2= new TreeSet<Integer>();
		int k=tree1.higher(7);
		System.out.println(k);

	}

}
