package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
public class Question3 {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("hi");
		ll.add(3);
		ll.add("there");
		ll.add("okay");
		ll.add(4);
		Iterator it = ll.listIterator(2);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
