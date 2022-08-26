package July_19;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Iterate_hashset_using_iterator {

	public static void main(String[] args) {
		HashSet<Object> hash = new HashSet<Object>();
		hash.add("red");
		hash.add("blue");
		hash.add(4);
		hash.add("hello");
		System.out.println("The array list is:-"+hash);
		Iterator<Object> it= hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
