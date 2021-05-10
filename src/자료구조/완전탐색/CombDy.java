package 자료구조.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class CombDy {

	public static void main(String[] args) {
		String[] arr = {"A","B","C","D","E"};
		
		System.out.println(solution(arr));

	}

	private static String[] solution(String[] arr) {
		String[] answer = {};
		
		int depth = 1;
		List<String> tempList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			boolean[] visited = new boolean[arr.length];
			StringBuilder sb = new StringBuilder();
			combine(arr, tempList, sb, visited, depth);
		}
		System.out.println(tempList);
		return answer;
	}

	private static void combine(String[] arr, List<String> list, StringBuilder sb, boolean[] visited, int depth) {
		
		for(int i=0; i<arr.length; i++) {
			if(depth == 1) {
				System.out.println(i);
			}
			if(!visited[i]) {
				visited[i] = true;
				sb.append(arr[i]);
				list.add(sb.toString());
				combine(arr, list, sb, visited, ++depth);
			}
		}
	}


}
