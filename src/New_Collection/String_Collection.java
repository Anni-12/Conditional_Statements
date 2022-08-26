package New_Collection;
import java.util.PriorityQueue;
public class String_Collection {

	public static void main(String[] args) {
//		ArrayList<String> arr= new ArrayList<>();
//		arr.add("hey");
//		arr.add("there");
//		System.out.println(arr);
		PriorityQueue<String> pro=new PriorityQueue<>();
		pro.add("hey");
		pro.add("there");
		pro.add("Aniket");
		pro.add("this");
		pro.add("side");
		for(String str:pro)
			System.out.println(str);
		//pro.clear();
		//System.out.println(pro);
		PriorityQueue<String> pro_1=new PriorityQueue<>();
		pro_1.addAll(pro);
		System.out.println(pro_1);
	}

}
