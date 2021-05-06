package 자료구조.Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DijkstraVer1Sh {

	public static void main(String[] args) {
		
		/*					
		 * 			1. 출발 노드 설정				
		 * 			2. 최단 거리 테이블 초기화
		 * 			3. 방문하지 않은 노드 중 최단 거리가 가장 짧은 노드 선택
		 * 			4. 해당 노드를 거쳐 다른 노드로 가는 비용을 계산하여 최단 거리 테이블 갱신
		 * 			5. 3,4번 반복
		 */
		
		// edges : 간선 + 비용 정보 - > 0,1 정점 2 비용
		int[][] edges = {{1,2,2},{1,3,5},{1,4,1},{2,3,3},{2,4,2},{3,2,3},{3,6,5},{4,3,3},{4,5,1},{5,3,1},{5,6,2}};
		
		// 그래프 생성 
		//  key : 정점 
		//  value : 정점:비용 
		Map<String,List<String>> graph = new HashMap<>();
		
		// 정점 생성
		for(int i=0; i<6; i++) {
			String key = String.valueOf(i+1);
			graph.put(key, new LinkedList<>());
		}
		
		// 그래프에 정보 담기(정점,비용)
		// ex) 1 - > 2:2 , 3:5 식으로
		for(int[] edge : edges) {
			int tempNode = edge[0];
			int tempAddNode = edge[1];
			
			String node = String.valueOf(tempNode);
			String addNode = String.valueOf(tempAddNode);
			int cost = edge[2];
			
			List<String> list = graph.get(node);
			list.add(addNode+":"+cost);
			
		}
		
		for(int i=0; i<6; i++) {
			String startNode = String.valueOf(i+1);
			Map<String,Integer> disTable = dijkstra(graph,startNode);
			System.out.println("Start Node : " +(i+1));
			System.out.println(disTable);
			System.out.println();
		}
		
		System.out.println(graph);
		

	}

	private static Map<String, Integer> dijkstra(Map<String, List<String>> graph, String startNode) {
		int infinity = Integer.MAX_VALUE;
		
		// 거리 테이블과 방문 여부 
		Map<String,Integer> distanceTable = new HashMap<>();
		Map<String,Boolean> visited = new HashMap<>();
		
		// 거리 테이블과 방문 여부 초기화
		for(String node : graph.keySet()) {
			distanceTable.put(node, infinity);
			visited.put(node, false);
		}
		
		// 시작 지점 초기화
		distanceTable.put(startNode, 0);
		visited.put(startNode, true);
		
		// 시작 지점과 연결된 노드로 거리테이블 갱신
		for(String edge : graph.get(startNode)) {
			String[] temp = edge.split(":");
			String node = temp[0];
			int cost = Integer.parseInt(temp[1]);
			distanceTable.put(node, cost);
		}
		
		// 노드 개수
		int nodeCnt = graph.size();
		
		// 시작 노드를 제외한 노드 개수 만큼 돌기
		for(int i=0; i<nodeCnt-1; i++) {
			// 방문하지 않은 노드 중 거리가 가장 작은 노드 구하기
			String minDistanceNode = getMinDistanceNode(visited,distanceTable);
			
			// 도달할 수 없는 경우
			if(!graph.containsKey(minDistanceNode))
				break;
			// 방문 처리
			visited.put(minDistanceNode, true);
			
			// 현재 노드의 비용
			int currentNodeCost = distanceTable.get(minDistanceNode);
			
			// 가장 작은 노드와 연결된 노드들 돌기
			for(String edge : graph.get(minDistanceNode)) {
				String[] temp = edge.split(":");
				String node = temp[0];
				
				// 현재 노드를 거쳐서 다른 노드로 가는 비용
				int cost = currentNodeCost + Integer.parseInt(temp[1]);
				
				// 최단 거리 테이블의 비용
				int tableCost = distanceTable.get(node);
				
				if(tableCost > cost)
					distanceTable.put(node, cost);
			}
		}
		return distanceTable;
	}

	// 방문하지 않은 노드 중 거리가 가장 작은 노드 구하기
	private static String getMinDistanceNode(Map<String, Boolean> visited, Map<String, Integer> distanceTable) {
		int min = Integer.MAX_VALUE;
		String minNode = null;
		// 모든 정점을 돌면서
		for(String node : visited.keySet()) {
			// 방문하지 않은 노드이면서 최소 거리 노드 구하기
			if(!visited.get(node) && distanceTable.get(node) < min)
				minNode = node;
		}
		return minNode;
	}

}
