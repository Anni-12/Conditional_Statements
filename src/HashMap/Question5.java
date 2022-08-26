package HashMap;

import java.util.HashMap;

public class Question5 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		//hm.clear();
		if(hm.isEmpty())
		{
			System.out.println("The map is empty");
		}
		else
		{
			System.out.println("The map is not empty");
		}
	}

}
