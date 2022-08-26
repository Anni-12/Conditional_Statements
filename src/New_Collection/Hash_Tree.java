package New_Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
public class Hash_Tree {

	public static void main(String[] args) {
		Set<Object> arr= new HashSet<>();
		arr.add("hi there");
		arr.add("aniket is here");
		arr.add("welcome you all");
		//arr.add(2);
		System.out.println(arr);
		TreeSet<String> h2t= new TreeSet(arr);
		//h2t.add("2");
		System.out.println(h2t);

	}

}
