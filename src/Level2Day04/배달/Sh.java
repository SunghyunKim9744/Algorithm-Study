package Level2Day04.배달;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Sh {

	public static void main(String[] args) {
		int N = 5;
		int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
		
		int K = 3;
		
		int result = solution(N,road,K);
		System.out.println(result);

	}

	private static int solution(int N, int[][] road, int K) {
		int answer = 0;

        List<List<Vertex>> graph = new ArrayList<>();
    
        for(int i=0; i<N+1; i++)
            graph.add(new ArrayList<Vertex>());
        
        for(int[] arr : road){
            List<Vertex> g1 = graph.get(arr[0]);
            List<Vertex> g2 = graph.get(arr[1]);
            
            g1.add(new Vertex(arr[1],arr[2]));
            g2.add(new Vertex(arr[0],arr[2]));
        }
        
        int[] costTable = dijkstra(graph,N);
        
        for(int i=1; i<N+1; i++) {
        	if(costTable[i] <= K)
        		answer++;
        }
        return answer;
	}

	private static int[] dijkstra(List<List<Vertex>> graph,int N) {
		int infinity = Integer.MAX_VALUE;
		
		int[] costTable = new int[N+1];
		for(int i=1; i<N+1; i++)
			costTable[i] = infinity;
		costTable[1] = 0;
		
		PriorityQueue<Vertex> pq = new PriorityQueue<>((v1,v2)->{
			return v1.cost - v2.cost;
		});
		
		pq.add(new Vertex(1,0));
		
		while(!pq.isEmpty()) {
			Vertex v = pq.poll();
			int currentVertexCost = v.cost;
			int minDistanceVertex = v.end;
			if(costTable[minDistanceVertex] < currentVertexCost)
				continue;
			
			for(Vertex ver : graph.get(minDistanceVertex)) {
				
				int node = ver.end;
				
				int cost = currentVertexCost+ver.cost;
				
				int tableCost = costTable[node];
				if(tableCost > cost) {
					costTable[node] = cost;
					pq.add(new Vertex(node,cost));
				}
			}
			
		}
		return costTable;
	}

}

class Vertex{
	int end;
    int cost;
    
    Vertex(int end, int cost){
        this.end = end;
        this.cost = cost;
    }
}
