package July_19;
import java.util.*;
public class HashMap_Sorting_Another {

	public static void main(String[] args) {
		HashMap<Integer,String> hash= new HashMap<Integer,String>();
		hash.put(22,"A");
		hash.put(32,"B");
		hash.put(43,"H");
		hash.put(4,"K");
		hash.put(56,"G");
		hash.put(78,"T");
		System.out.println("The hashmap before:-"+hash);
		TreeMap<Integer,String> tree =new TreeMap<Integer,String>(hash);
		System.out.println("The new sorted one is:-"+tree);
	}

}
