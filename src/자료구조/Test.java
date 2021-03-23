package 자료구조;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int[] arr = {6,5,3,2,1,0};
		
		// 0,1,2,3,5
		Arrays.sort(arr);
		
//		int index = Arrays.binarySearch(arr,5);
//		System.out.println(index);
//		
		Map<String,List<String>> graph = new HashMap<>();
		
//		List<Integer> arrList = new LinkedList<>();
//		arrList.add(2);
//		arrList.add(3);
		
		String[] str = {"AB","AC","AD"};
		graph.put("A", new LinkedList<>(Arrays.asList(str)));
		
		
		System.out.println(graph);
		
		List<String> temp = graph.get("A");
		
		
		
		temp.add("AE");
		

		
		System.out.println(graph);
	}

}
