package 고득점Kit.Graph.가장먼노드;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {

		int n = 6;
		
		int[][] vertex = new int[][] {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		
		solution(n,vertex);

	}

	// 다익스트라로 꼭 풀어볼 것!!
	// (0.38ms, 51.8MB) - > (161.08ms, 74MB)
	private static void solution(int n, int[][] vertex) {
		
		Map<Integer,List<Integer>> graph = new HashMap<>();
		
		for(int[] arr : vertex) {
			if(graph.get(arr[0])==null)
				graph.put(arr[0], new LinkedList<>());
			if(graph.get(arr[1])==null)
				graph.put(arr[1], new LinkedList<>());
			
			graph.get(arr[0]).add(arr[1]);
			graph.get(arr[1]).add(arr[0]);
		}
		
		Map<Integer,Boolean> visited = new HashMap<>();
		for(Integer node : graph.keySet())
			visited.put(node, false);
		
		Map<Integer,Integer> depth = bfs(graph,visited,1);
		
		int max = 0;
		for(Integer i : depth.keySet()) {
			if(max<depth.get(i))
				max = depth.get(i);
		}
		
		int answer = 0;
		for(Integer i : depth.keySet()) {
			if(max == depth.get(i))
				answer++;
		}
		
	}

	private static Map<Integer, Integer> bfs(Map<Integer, List<Integer>> graph, Map<Integer, Boolean> visited, int start) {
		Queue<Integer> que = new LinkedList<>();
		que.offer(start);
		visited.put(start, true);
		
		Map<Integer,Integer> depth = new HashMap<>();
		depth.put(1,0);
		while(!que.isEmpty()) {
			Integer element = que.poll();
			for(Integer node : graph.get(element)) {
				if(!visited.get(node)) {
					que.offer(node);
					visited.put(node, true);
					depth.put(node, depth.get(element)+1);
				}
			}
		}
		
		return depth;
		
	}

}
