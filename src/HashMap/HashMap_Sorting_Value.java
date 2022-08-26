package HashMap;
import java.util.*;
public class HashMap_Sorting_Value {

	public static void main(String[] args) {
		HashMap<Integer,String> h= new HashMap<Integer,String>();
		h.put(12,"H");
		h.put(45,"B");
		h.put(34,"K");
		h.put(11,"J");
		h.put(48,"A");
		System.out.println(h);
		LinkedList<Object> ll= new LinkedList<Object>();
		TreeMap<Integer,String> t= new TreeMap<Integer,String>(h);
		System.out.println(t);

	}

}
