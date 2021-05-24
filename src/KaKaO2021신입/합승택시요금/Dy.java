package KaKaO2021신입.합승택시요금;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dy {

	public static void main(String[] args) {
		int n = 6;
		int s = 4;
		int a = 6;
		int b = 2;
		int[][] l = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
		solution(n,s,a,b,l);
	}
	
	public static int solution(int n, int s, int a, int b, int[][] fares) {
		int max = Integer.MAX_VALUE;
        int answer = max;
        List<List<Node>> list = new ArrayList<>();
        
        for(int i=0; i<n+1; i++) {
        	list.add(new ArrayList<Node>());
        }
        
        for(int[] fare: fares) {
        	Node node1 = new Node(fare[1], fare[2]);
        	Node node2 = new Node(fare[0], fare[2]);
        	list.get(fare[0]).add(node1);
        	list.get(fare[1]).add(node2);
        }
                
        int[][] min = new int[n+1][n+1];
        
        for(int i=1; i<7; i++) {
        	Arrays.fill(min[i], max);
        	dijkstra(i, min[i], n, list);
        }
        
        for(int i=1; i<min.length; i++) {
        	for(int j=1; j<min[i].length; j++) {
            	System.out.println(min[i][j]);
            }
        }
        
        for(int i=1; i<7; i++) {
        	if(answer> min[s][i] + min[i][a] + min[i][b]) {
        		answer = min[s][i] + min[i][a] + min[i][b];
        	}
        }
    	if(answer> min[s][a] + min[s][b]) {
    		answer = min[s][a] + min[s][b];
    	}
        return answer;
    }
	
	private static void dijkstra(int s, int[] min, int n, List<List<Node>> list) {
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		boolean[] visited = new boolean[n+1];
		Node start = new Node(s, 0);
		min[s] = 0;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			Node curNode = queue.poll();
			int cur = curNode.end;
			if(visited[cur]) {
				continue;
			}else {
				visited[cur] = true;
			}
			for(Node node: list.get(cur)) {
				if(min[node.end] > min[cur] + node.weight) {
					min[node.end] = min[cur] + node.weight;
					queue.add(new Node(node.end, min[node.end]));
				}
			}
		}
	}

	public static class Node implements Comparable<Node>{
	    int end, weight;

	    public Node(int end, int weight){
	        this.end = end;
	        this.weight = weight;
	    }

	    @Override
	    public int compareTo(Node o) {
	        return weight - o.weight;
	    }
	}

}
