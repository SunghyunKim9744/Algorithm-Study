package 자료구조.Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraVer2Sh {

	public static void main(String[] args) {
		
		/*					
		 * 			1. 출발 노드 설정				
		 * 			2. 최단 거리 테이블 초기화
		 * 			3. 방문하지 않은 노드 중 최단 거리가 가장 짧은 노드 선택(우선순위 큐 이용)
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
		
		// 거리 순으로 힙 만들기
		PriorityQueue<String> heap = new PriorityQueue<>((s1,s2)->{
			// s1 , s2의 거리
			String tempS1 = s1.split(":")[1];
			String tempS2 = s2.split(":")[1];
			
			int disS1 = Integer.parseInt(tempS1);
			int disS2 = Integer.parseInt(tempS2);
			return disS1-disS2;
		});
		
		// 힙에 시작 노드+ 비용 0으로 넣기
		heap.offer(startNode+":"+0);

		// 힙이 빌 때 까지
		while(!heap.isEmpty()) {
			
			// 최소 거리 노드 + 비용 ( 1:0 )
			String edgeCost = heap.poll();
			String[] temp = edgeCost.split(":");
			
			// 최소 거리 노드
			String minDistanceNode = temp[0];
			
			// 최소 거리 노드의 비용
			int currentNodeCost = Integer.parseInt(temp[1]);
			
			// 방문 한적이 있다면 넘어가기
			if(distanceTable.get(minDistanceNode) < currentNodeCost)
				continue;
//			if(visited.get(minDistanceNode))
//				continue;
			
			// 방문 처리
			//visited.put(minDistanceNode, true);
			
			for(String edge : graph.get(minDistanceNode)) {
				String[] tempNode = edge.split(":");
				
				// 연결된 노드
				String node = tempNode[0];
				
				// 현재 노드를 거쳐서 다른 노드로 가는 비용
				int cost = currentNodeCost + Integer.parseInt(tempNode[1]);
				
				// 테이블에 있는 연결된 노드의 비용
				int tableCost = distanceTable.get(node);
				
				if(tableCost > cost) {
					distanceTable.put(node, cost);
					heap.offer(node+":"+cost);
				}
			}
			
		}
		
		
		
		
		
		return distanceTable;
	}

	

}
