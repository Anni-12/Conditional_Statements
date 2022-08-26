package July_19;
import java.util.*;
import java.util.HashMap;
import java.util.*;
public class HashMap_Sorting {

	public static void main(String[] args) {

		HashMap<Integer,String> hash= new HashMap<Integer,String>();
		hash.put(22,"A");
		hash.put(32,"B");
		hash.put(43,"H");
		hash.put(4,"K");
		hash.put(56,"G");
		hash.put(78,"T");
		//System.out.println("The hashmap before:-"+hash);
		Set set= hash.entrySet();
		Iterator it= set.iterator();
		while(it.hasNext())
		{
			Map.Entry xyz= (Map.Entry)it.next();
			System.out.print(xyz.getKey()+": ");
			System.out.println(xyz.getValue());
		}
		System.out.println("------------------------");
		TreeMap<Integer,String> tree= new TreeMap<>(hash);
		Set set1= tree.entrySet();
		Iterator it1= set1.iterator();
		while(it1.hasNext())
		{
			Map.Entry xyz1= (Map.Entry)it1.next();
			System.out.print(xyz1.getKey()+": ");
			System.out.println(xyz1.getValue());
		}
//		Map<Integer,String>map=sortbyvalues(hash);
//		System.out.println("After sorting");
//		Set set2= map.entrySet();
//		Iterator it2= set2.iterator();
//		while(it2.hasNext())
//		{
//			Map.Entry pair= (Map.Entry)it2.next();
//			System.out.println(pair.getKey()+": ");
//			System.out.println(pair.getValue());
//		}
//	}
//	private static HashMap sortbyvalues(HashMap map)
//	{
//		List list= new LinkedList(map.entrySet());
//		Collections.sort(list,new Comparator(){
//			
//		}
//	}

}
