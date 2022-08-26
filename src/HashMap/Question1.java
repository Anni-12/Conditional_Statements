package HashMap;
import java.util.HashMap;
import java.util.Map;
public class Question1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		System.out.println(hm);
		for(Map.Entry m: hm.entrySet()) 
		{
			System.out.println((m.getKey()+" "+m.getValue()));
		}
	}

}
