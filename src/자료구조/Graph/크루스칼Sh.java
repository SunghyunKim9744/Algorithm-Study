package 자료구조.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class 크루스칼Sh {

	public static void main(String[] args) {
		
		Map<String,Integer> edgesMap = new HashMap<>();
		
		// 간선정보와 비용 넣기
		edgesMap.put("12", 6);
		edgesMap.put("14", 4);
		edgesMap.put("23", 5);
		edgesMap.put("24", 3);
		edgesMap.put("25", 7);
		edgesMap.put("26", 8);
		edgesMap.put("36", 8);
		edgesMap.put("45", 9);
		edgesMap.put("56", 11);
		
		// 오름 차순 정렬
		List<Entry<String, Integer>> edges = new ArrayList<>(edgesMap.entrySet());

		edges.sort((e1,e2)->{
			return e1.getValue()-e2.getValue();
		});
		System.out.println(edges);
		int money = 0;
		
		// 그래프 생성
		Map<String,List<String>> graph = new HashMap<>();
		
		// 테이블
		Map<String,String> table = new HashMap<>();
		
		// 테이블 초기화 및 그래프에 정점 넣기
		for(int i=0; i<6; i++) {
			table.put(String.valueOf(i+1), String.valueOf(i+1));
			graph.put(String.valueOf(i+1), new LinkedList<>());
		}
			
		
		// 간선길이 만큼 돌리기
		for(Entry<String,Integer> edge : edges) {
			
			// 연결된 정점 2개
			String vertex1 = edge.getKey().substring(0,1);
			String vertex2 = edge.getKey().substring(1,2);
			
			String vertex1Parent = findParent(table,vertex1);
			String vertex2Parent = findParent(table,vertex2);
			
			// 같은 집합이라면(싸이클 생성) 넘어가기
			if(vertex1Parent.equals(vertex2Parent))
				continue;
			
			// 같은 집합이 아니라면 같은 집합으로 만들고 그래프 추가 및 비용 추가 
			else {
				unionParent(table,vertex1,vertex2);
				List<String> list = graph.get(vertex1);
				list.add(vertex2);
				list = graph.get(vertex2);
				list.add(vertex1);
				money += edge.getValue();
			}
				
		}
		
		System.out.println("그래프 : " + graph);
		System.out.println("최소 비용 : " + money);
	}

	private static void unionParent(Map<String, String> table, String vertex1, String vertex2) {
		String vertex1Parent = findParent(table,vertex1);
		String vertex2Parent = findParent(table,vertex2);
		
		// 작은 값이 부모가 되도록 하기
		int value = vertex1Parent.compareTo(vertex2Parent);
		if(value < 0) 
			table.put(vertex2Parent, vertex1Parent);
		
		else 
			table.put(vertex1Parent, vertex2Parent);
		
		
	}

	private static String findParent(Map<String, String> table, String vertex) {
		String parent = table.get(vertex);
		
		if(!parent.equals(vertex)) {
			parent = findParent(table,parent);
			table.put(vertex, parent);
		}
		return parent;
	}

}
