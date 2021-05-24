package KaKaO2021신입.메뉴리뉴얼;

import java.util.HashMap;
import java.util.Map;

public class Dy {

	public static void main(String[] args) {
		String[] k = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] l = {2,3,4};
		solution(k,l);
	}
	
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(String order: orders) {
        	boolean[] visited = new boolean[order.length()]; 
        	for(int num: course) {
                add(order, map, sb, num, visited, 0);
        	}
        }
        return answer;
    }

	private static void add(String order, Map<String, Integer> map, StringBuilder sb, int num, boolean[] visited, int depth) {
		
		if(num == depth) {
			map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
			System.out.println(sb.toString());
		}
		
		for(int i=0; i<order.length(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				sb.append(order.substring(i, i+1));
				StringBuilder sb2 = new StringBuilder(sb);
				add(order, map, sb2, num, visited, ++depth);
			}
		}
		return;
	}
}
