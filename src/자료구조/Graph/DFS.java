package 자료구조.Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DFS {

	public static void main(String[] args) {

		/*
		 * 
		 * 						AㅡㅡㅡㅡㅡㅡㅡㅡB
		 * 					   / \		   /
		 * 					  C	  \		  G
		 * 					  |\   \     / \
		 *                    | \   \   /   \
		 *                    |  \   \ /     \
		 *  				  DㅡㅡE   H       F
		 *  
		 */
		
		System.out.println();
		// 그래프 생성
		Map<String,List<String>> graph = new HashMap<>();
		
		// 정점 A와 연결된 리스트 넣기
		List<String> list = new LinkedList<>();
		list.add("B");
		list.add("C");
		list.add("H");
		graph.put("A", list);
		
		// 정점 B와 연결된 리스트 넣기
		list = new LinkedList<>();
		list.add("A");
		list.add("G");
		graph.put("B", list);

		// 정점 C와 연결된 리스트 넣기
		list = new LinkedList<>();
		list.add("A");
		list.add("D");
		list.add("E");
		graph.put("C", list);
		
		// 정점 D와 연결된 리스트 넣기
		list = new LinkedList<>();
		list.add("C");
		list.add("E");
		graph.put("D", list);
		
		// 정점 E와 연결된 리스트 넣기
		list = new LinkedList<>();
		list.add("C");
		list.add("D");
		graph.put("E", list);
		
		// 정점 F와 연결된 리스트 넣기
		list = new LinkedList<>();
		list.add("G");
		graph.put("F", list);
		
		// 정점 G와 연결된 리스트 넣기
		list = new LinkedList<>();
		list.add("B");
		list.add("F");
		list.add("H");
		graph.put("G", list);
		
		// 정점 H와 연결된 리스트 넣기
		list = new LinkedList<>();
		list.add("A");
		list.add("G");
		graph.put("H", list);
		
		System.out.println("============== 인접 리스트 그래프 ===============");
		System.out.println();
		System.out.println(graph);
		
		
		
		
		System.out.println();
		System.out.println("================ DFS ===============");
		// ============= dfs ===================
		
		// 방문 여부위한 map 생성
		Map<String, Boolean> visited = new HashMap<>();
		visited.put("A", false);
		visited.put("B", false);
		visited.put("C", false);
		visited.put("D", false);
		visited.put("E", false);
		visited.put("F", false);
		visited.put("G", false);
		visited.put("H", false);
		dfs(graph, visited, "A");

		System.out.println();
		System.out.println();
		System.out.println("================ BFS ===============");
		// ============= bfs ===================
		
		// 방문 여부위한 map 생성
		Map<String,Boolean> visited2 = new HashMap<>();
		visited2.put("A", false);
		visited2.put("B", false);
		visited2.put("C", false);
		visited2.put("D", false);
		visited2.put("E", false);
		visited2.put("F", false);
		visited2.put("G", false);
		visited2.put("H", false);
		bfs(graph,visited2,"A");
	}

	private static void dfs(Map<String, List<String>> graph, Map<String, Boolean> visited, String current) {
		
		// 방문 처리
		visited.put(current,true);
		System.out.print(current+" ");
		
		// 인접 정점 순회
		for(String s : graph.get(current))
			// 이미 방문한 정점이 아니라면 dfs
			if(!visited.get(s))
				dfs(graph,visited,s);
		
	}
	
	private static void bfs(Map<String, List<String>> graph, Map<String, Boolean> visited, String current) {
		
		// 시작 지점 큐에 넣기 
		Queue<String> que = new LinkedList<>();
		que.offer(current);
		
		// 방문 처리
		visited.put(current,true);
		
		// 모든 정점을 다 돌때까지
		while(!que.isEmpty()) {
			String vertex = que.poll();
			System.out.print(vertex+" ");
			for(String s : graph.get(vertex)) {
				if(!visited.get(s)) {
					que.offer(s);
					visited.put(s, true);
				}
					
			}
			
		}
		
		
		
	}

}
