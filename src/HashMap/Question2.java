package HashMap;

import java.util.HashMap;

public class Question2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		System.out.println(hm);
		System.out.println("The number of key elements are:-"+hm.size());

	}

}
