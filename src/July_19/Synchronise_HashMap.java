package July_19;
import java.util.*;
public class Synchronise_HashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1,"A");
		hm.put(3,"B");
		hm.put(2,"C");
		hm.put(4,"D");
		System.out.println("The previous HashMap is:-"+hm);
//		HashMap<Integer,String> hm1= (HashMap<Integer, String>) Collections.synchronizedMap(hm);
//		System.out.println("The new map is:-"+hm1);
		HashMap<Integer,String> hm1=(HashMap<Integer,String>)hm.clone();
		System.out.println("The new map is:-"+hm1);
		
		

	}

}
