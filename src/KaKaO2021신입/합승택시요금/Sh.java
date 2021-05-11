package KaKaO2021신입.합승택시요금;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Sh {

	public static void main(String[] args) {
		int n = 6;
		int s = 4;
		int a = 6;
		int b = 2;
		int[][] fares = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
		
		int answer = solution(n,s,a,b,fares);
	}

	private static int solution(int n, int s, int a, int b, int[][] fares) {
		Map<Integer,List<String>> graph = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			graph.put(i+1, new LinkedList<>());
		}
		
		
		for(int[] fare : fares) {
			List<String> list = graph.get(fare[0]);
			list.add(fare[1] + ":"+fare[2]);
			list = graph.get(fare[1]);
			list.add(fare[0] + ":"+fare[2]);
		}
		
		int startNode = s;
		Map<Integer,Integer> distMap = diijkstra(startNode,graph,n);
		
		int min = Integer.MAX_VALUE;
		for(int i=1; i<=n; i++) {
			int temp = distMap.get(i);
			Map<Integer,Integer> tempDist = diijkstra(i,graph,n);
			int ia = tempDist.get(a);
			int ib = tempDist.get(b);
			
			int total = temp+ia+ib;
			if(min > total)
				min = total;
		}
		
		return min;
	}

	private static Map<Integer, Integer> diijkstra(int startNode, Map<Integer, List<String>> graph, int n) {
		
		int max = Integer.MAX_VALUE;
		Map<Integer,Integer> dist = new HashMap<>();
		
		for(int i=0; i<n; i++) 
			dist.put(i+1, max);
	
		dist.put(startNode, 0);
		
		PriorityQueue<String> heap = new PriorityQueue<>((s1,s2)->{
			String tempS1 = s1.split(":")[1];
			String tempS2 = s2.split(":")[1];
			
			int disS1 = Integer.parseInt(tempS1);
			int disS2 = Integer.parseInt(tempS2);
			return disS1-disS2;
		});
			
		heap.offer(startNode+":"+0);
		
		while(!heap.isEmpty()) {
			String edgeCost = heap.poll();
			String[] temp = edgeCost.split(":");
			int minDistanceNode = Integer.parseInt(temp[0]);
			int currentNodeCost = Integer.parseInt(temp[1]);
			if(dist.get(minDistanceNode) < currentNodeCost)
				continue;
			
			for(String edge : graph.get(minDistanceNode)) {
				String[] tempNode = edge.split(":");
				
				int node = Integer.parseInt(tempNode[0]);
				
				int cost = currentNodeCost + Integer.parseInt(tempNode[1]);
				
				int tableCost = dist.get(node);
				
				if(tableCost > cost) {
					dist.put(node, cost);
					heap.offer(node+":"+cost);
				}
			}
		}
		
		return dist;
	}

}
