package KaKaO2021신입.카드짝맞추기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		int[][] board = {{1,0,0,3},{2,0,0,0},{0,0,0,2},{3,0,1,0}};

		int r = 1;
		int c = 0;
		
		int answer = solution(board,r,c);
	}

	private static int solution(int[][] board, int r, int c) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int[] temp : board) {
			for(int i : temp)
				set.add(i);
		}
		
		set.remove(0);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : set)
			list.add(i);
		
		List<String> allList = new ArrayList<>();
		boolean[] visited = new boolean[set.size()];
		int[] temp = new int[set.size()];
		int depth = 0;
		permutaion(list,temp,visited,depth,set.size(),allList);
		
		System.out.println(allList);
		return 0;
	}

	private static void permutaion(List<Integer> list, int[] temp, boolean[] visited, int depth, int r,
			List<String> allList) {
		if(depth == r) {
			StringBuilder sb = new StringBuilder();
			for(int i : temp) 
				sb.append(i);
			allList.add(sb.toString());
		}
		
		for(int i=0; i<list.size(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				temp[depth] = list.get(i);
				permutaion(list, temp, visited, depth+1, r, allList);
				visited[i] = false;
			}
		}
		
	}

}
