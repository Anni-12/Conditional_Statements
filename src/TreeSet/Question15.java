package TreeSet;

import java.util.TreeSet;

public class Question15 {

	public static void main(String[] args) {
		TreeSet<Integer> tree1= new TreeSet<Integer>();
		tree1.add(7);
		tree1.add(4);
		tree1.add(3);
		tree1.add(8);
		tree1.add(2);
		System.out.println("The treeset is:-"+tree1);
		tree1.pollLast();
		System.out.println("The new treeset is:-"+tree1);

	}

}
