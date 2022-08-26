package July_19;
import java.util.*;
public class Iterate_Treeset {

	public static void main(String[] args) {
		TreeSet<Object> t= new TreeSet<Object>();
		t.add("hello");
		t.add("2");
		t.add("there");
		t.add("6");
		for(Object i:t)
		{
			System.out.println(i);
		}
	}

}
