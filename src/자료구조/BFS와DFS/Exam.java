package 자료구조.BFS와DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exam {

	public static void main(String[] args) {
		
		
		System.out.println("================= 인접 리스트 =================");
		int[][] listGraph = new int[9][];
	
		listGraph[1] = new int[]{2,3,8};
		listGraph[2] = new int[]{1,7};
		listGraph[3] = new int[]{1,4,5};
		listGraph[4] = new int[]{3,5};
		listGraph[5] = new int[]{3,4};
		listGraph[6] = new int[]{7};
		listGraph[7] = new int[]{2,6,8};
		listGraph[8] = new int[]{1,7};
		
		boolean[] visited = new boolean[9];
		listDfs(listGraph,1,visited);
		System.out.println();
		
		
		System.out.println("================= 인접 리스트2 =================");
		List<List<Integer>> listGraph2 = new LinkedList<>();
		listGraph2.add(null);
		listGraph2.add(Arrays.asList(new Integer[] {2,3,8}));
		listGraph2.add(Arrays.asList(new Integer[] {1,7}));
		listGraph2.add(Arrays.asList(new Integer[] {1,4,5}));
		listGraph2.add(Arrays.asList(new Integer[] {3,5}));
		listGraph2.add(Arrays.asList(new Integer[] {3,4}));
		listGraph2.add(Arrays.asList(new Integer[] {7}));
		listGraph2.add(Arrays.asList(new Integer[] {2,6,8}));
		listGraph2.add(Arrays.asList(new Integer[] {1,7}));
		
		boolean[] visited2 = new boolean[9];
		listDfs2(listGraph2,1,visited2);
		System.out.println();
		
		System.out.println("================= 인접 행렬 =================");
		int[][] arrGraph = new int[9][8];
		arrGraph[1] = new int[]{0,1,1,0,0,0,0,1};
		arrGraph[2] = new int[]{1,0,0,0,0,0,1,0};
		arrGraph[3] = new int[]{1,0,0,1,1,0,0,0};
		arrGraph[4] = new int[]{0,0,1,0,1,0,0,0};
		arrGraph[5] = new int[]{0,0,1,1,0,0,0,0};
		arrGraph[6] = new int[]{0,0,0,0,0,0,1,0};
		arrGraph[7] = new int[]{0,1,0,0,0,1,0,1};
		arrGraph[8] = new int[]{1,0,0,0,0,0,1,0};
		
		boolean[] visited3 = new boolean[9];
		
		
		arrDfs(arrGraph,1,visited3);
		System.out.println();
	}


	private static void listDfs(int[][] listGraph, int current, boolean[] visited) {
		
		visited[current] = true;
		System.out.print(current+"  ");
		
		for(int i=0; i<listGraph[current].length; i++) {
			if(!visited[listGraph[current][i]]) {
				listDfs(listGraph,listGraph[current][i],visited);
			}
		}
		
	}
	
	private static void listDfs2(List<List<Integer>> listGraph2, int current, boolean[] visited) {
		visited[current] = true;
		
		System.out.print(current + "  ");
		
		for(Integer i : listGraph2.get(current)) {
			if(!visited[i])
				listDfs2(listGraph2,i,visited);
		}
		
	}
	
	private static void arrDfs(int[][] arrGraph, int current, boolean[] visited) {
		visited[current] = true;
		System.out.print(current+"  ");
		for(int i=0; i<arrGraph[current].length; i++) {
			if(arrGraph[current][i] == 1 && !visited[i+1])
				arrDfs(arrGraph,i+1,visited);
		}
		
	}

}
