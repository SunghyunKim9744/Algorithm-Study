package 고득점Kit.Graph.가장먼노드;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sh {

	public static void main(String[] args) {

		int n = 6;
		
		int[][] vertex = new int[][] {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		
		solution(n,vertex);

	}

	private static void solution(int n, int[][] vertex) {
		
		List<List<Integer>> list = new LinkedList<>();
		
		for(int i=0; i<=n; i++)
			list.add(Arrays.asList(new Integer[] {0}));
		
		for(int i=0; i<vertex.length; i++) {
			int firstNode = vertex[i][0];
			int secondNode = vertex[i][1];
			
			list.get(firstNode).add(secondNode);
			list.get(secondNode).add(firstNode);
		}
		
		System.out.println(list);
		
	}

}
