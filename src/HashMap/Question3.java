package HashMap;

import java.util.HashMap;

public class Question3 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		System.out.println("The map 2 is:-"+hm);
		HashMap<Integer,String> hm1= new HashMap<Integer,String>(); 
		hm1.put(5,"E");
		hm1.put(6,"F");
		hm1.put(7,"G");
		hm1.put(8,"H");
		System.out.println("The map 2 is:-"+hm1);
		hm1.putAll(hm);
		System.out.println("The new map 2 is:-"+hm1);

	}

}
