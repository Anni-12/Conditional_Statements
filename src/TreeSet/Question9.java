package TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
public class Question9 {

	public static void main(String[] args) {
		TreeSet<Integer> tree1= new TreeSet<Integer>();
		tree1.add(7);
		tree1.add(4);
		tree1.add(3);
		tree1.add(8);
		tree1.add(2);
		TreeSet<Integer> tree2= new TreeSet<Integer>();
		tree2=(TreeSet)tree1.headSet(7);
		Iterator it= tree2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
