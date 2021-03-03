package 자료구조.해시;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Hash_Sh {

	public static void main(String[] args) {
	
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(3, "b");
		map.put(2, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");
		map.put(7, "g");
		
		List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
		
//		Object[] arr = map.keySet().toArray();
		
//		Arrays.sort(arr);
		
		Collections.sort(list, (o1,o2)->{
			return o2.getValue().compareTo(o1.getValue());
		});
		
		for(Entry<Integer,String>  ent :  list)
			System.out.println(ent.getKey() + " , " + ent.getValue());
	}

}
