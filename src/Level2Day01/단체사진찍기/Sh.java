package Level2Day01.단체사진찍기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sh {

	public static void main(String[] args) {
		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};
		
		int answer = solution(n,data);

	}

	private static int solution(int n, String[] data) {
		int answer = 0;
		String[] arr = {"A","C","F","J","M","N","R","T"};
		boolean[] visited = new boolean[8];
		List<String> list = new ArrayList<>();
		String[] temp = new String[8];
		int depth = 0;
		int r = 8;
		permutation(arr,temp,visited,depth,r,list);
		
//		Arrays.sort(data,(s1,s2)->{
//			int n1 = Integer.parseInt(s1.substring(4,5));
//			int n2 = Integer.parseInt(s2.substring(4,5));
//			
//			return n2-n1;
//		});
		int cnt = 0;
		for(int i=0; i<list.size(); i++) {
			boolean bool = false;
			
			for(String s : data) {
				String people1 = s.substring(0,1);
				String people2 = s.substring(2,3);
				String comp = s.substring(3,4);
				int value = Integer.parseInt(s.substring(4,5));
				String str = list.get(i);
				
				int index1 = str.indexOf(people1);
				int index2 = str.indexOf(people2);
				
				int betweenNum = Math.abs(index1-index2)-1;
				
				if(comp.equals("=") && (value != betweenNum) ) {
					bool = true;
					break;
				}
				
				else if(comp.equals(">") && (value >= betweenNum)) {
					bool = true;
					break;
				}
				
				else if(comp.equals("<") && (value <= betweenNum)){
					bool = true;
					break;
				}
			}
			if(!bool)
				cnt++;
		}
		
		answer = cnt;
		System.out.println(answer);
		return answer;
	}

	private static void permutation(String[] arr, String[] temp, boolean[] visited, int depth, int r, List<String> list) {
		
		if(depth == r) {
			StringBuilder sb = new StringBuilder();
			for(String s : temp)
				sb.append(s);
			
			list.add(sb.toString());
			return;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				temp[depth] = arr[i];
				permutation(arr, temp, visited, depth+1, r, list);
				visited[i] = false;
			}
		}
	}

}
