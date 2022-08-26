package July_19;
import java.util.*;
public class new_sort {

	public static void main(String[] args) {
		HashMap<String, Integer> arr = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        arr.put("abdul", 54);
        arr.put("shahjhan", 72);
        arr.put("mumtaz", 34);
        arr.put("laila", 16);
        arr.put("majnu", 22);
        arr.put("salim", 87);
        arr.put("jahangir", 94);
        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list); 
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : arr.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMap);
        for(Integer zzz:list) {
			System.out.println(zzz);
        }

	}

}
