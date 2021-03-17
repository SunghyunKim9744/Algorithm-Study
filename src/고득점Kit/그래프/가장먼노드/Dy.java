package 고득점Kit.그래프.가장먼노드;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// 4:22 ~
public class Dy {
	public static void main(String[] args) {
		int n = 6;
		int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		System.out.println(solution(n, edge));
	}

	public static int solution(int n, int[][] edge) {
        int answer = 0;
        Map<Integer,LinkedList<Integer>> graph = new HashMap<Integer,LinkedList<Integer>>();
        for(int[] key: edge) {
        	LinkedList<Integer> list = graph.getOrDefault(key[0], new LinkedList<Integer>());
        	list.add(key[1]);
        	graph.put(key[0], list);
        	list = graph.getOrDefault(key[1], new LinkedList<Integer>());
        	list.add(key[0]);
        	graph.put(key[1], list);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[graph.size()+2];
        visited[1] = true;
        queue.add(1);
        int num = 0;
        int addNum = 0;
        int depth = 0;
        while(!queue.isEmpty()) {
        	int nextKey = queue.poll();
        	for(Integer value: graph.get(nextKey)) {
    			if(visited[value] == false) {
    				visited[value] = true;
    				queue.add(value);
    				if(num == 0) {
    					addNum++;
    				}
    			}
    		}
        	
        	if(num>0)
        		num--;
        	
        	if(addNum != 0) {
        		num = addNum;
        		addNum = 0;
        	}
        	
        	if(num !=0) {
        		answer = 0;
        	}else {
        		answer++;
        	}
        }
        return answer;
    }
}
