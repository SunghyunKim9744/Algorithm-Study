package Level2Day04.배달;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dy {

	public static void main(String[] args) {

		int N = 6;
		int[][] road = {{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}};
		int K = 4;
		System.out.println(solution(N, road, K));
	}
	
	public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        Map<Integer, List<V>> map = new HashMap<>();
        int[] min = new int[N+1];
        boolean[] visited = new boolean[N+1];
        for(int i=1; i<= N; i++) {
        	map.put(i, new LinkedList<>());
        	min[i] = Integer.MAX_VALUE;
        }
        for(int[] key: road) {
        	V v1 = new V(key[1], key[2]);
        	V v2 = new V(key[0], key[2]);
        	map.get(key[0]).add(v1);
        	map.get(key[1]).add(v2);
        }
        
        daik(map, min, visited);
        for(int i=1; i<= N; i++) {
        	if(min[i] <= K) {
        		answer++;
        	}
        }
        return answer;
    }

	private static void daik(Map<Integer, List<V>> map, int[] min, boolean[] visited) {
		
		Queue<V> queue = new PriorityQueue<>();
		queue.add(new V(1,0));
        min[1] = 0;
		while(!queue.isEmpty()) {
			V curV = queue.poll();
			if(visited[curV.end]) {
				continue;
			}
			visited[curV.end] = true;
			for(V key: map.get(curV.end)) {
				queue.add(key);
				if(min[curV.end] + key.weight < min[key.end]) {
					min[key.end] = min[curV.end] + key.weight;
				}
			}
		}
		
		
	}
	
	static class V implements Comparable<V>{
	    int end, weight;

	    public V(int end, int weight){
	        this.end = end;
	        this.weight = weight;
	    }

	    @Override
	    public int compareTo(V o) {
	        return weight - o.weight;
	    }
	}

}
