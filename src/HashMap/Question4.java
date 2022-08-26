package HashMap;

import java.util.HashMap;

public class Question4 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		System.out.println("The map before:-"+hm);
		hm.clear();
		System.out.println("The map after:-"+hm);

	}

}
