package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;
public class Question4 {

	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("Hello");
		tree.add("There");
		tree.add("Hey");
		tree.add("Okay");
		System.out.println("The TreeSet is:-"+tree);
		Iterator it= tree.descendingIterator();
		System.out.println("reverse:-");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
