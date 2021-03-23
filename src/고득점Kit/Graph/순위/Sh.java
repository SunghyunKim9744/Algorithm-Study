package 고득점Kit.Graph.순위;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {

		int n = 5;
		int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
		
		solution(n,results);
	}

	private static void solution(int n, int[][] results) {
		
		Map<Integer,List<Integer>> graph = new HashMap<>();
		for(int[] arr : results) {
			if(graph.get(arr[0]) == null)
				graph.put(arr[0], new LinkedList<>());
			
			graph.get(arr[0]).add(arr[1]);
		}
		
		graph.keySet();
		
	}

}
