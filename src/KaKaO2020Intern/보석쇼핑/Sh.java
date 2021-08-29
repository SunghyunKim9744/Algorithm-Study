package KaKaO2020Intern.보석쇼핑;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String[] gems = {"DIA","EM","EM","RUB","DIA"};
		
		int[] answer = solution(gems);
		for(int i : answer)
			System.out.println(i);
	
	}

	private static int[] solution(String[] gems) {
		int[] answer = new int[2];
		
		int start = 0;
		int end = 0;
		Set<String> set = new HashSet<>();
		for(String s : gems)
			set.add(s);
		
		Map<String,Integer> map = new HashMap<>();
		
		int min = gems.length+1;
		
		for(int i=0; i<gems.length; i++) {
			String gemName = gems[i];
			map.put(gemName, map.getOrDefault(gemName,0)+1);
			end++;
			if(map.size() == set.size()) {
				for(int j=start; j<end; j++) {
					String currentGem = gems[j];
					int count = map.get(currentGem);
					if(count == 1) {
						int len = end-start;
						if(len < min) {
							min = len;
							answer[0] = start+1;
							answer[1] = end;
						}
						map.remove(currentGem);
						start++;
						break;
					}
					else {
						map.put(currentGem, map.get(currentGem)-1);
						start++;
					}
				}
			}
		}
		
		
		return answer;
		
		
	}

	// 4:03
//	private static int[] solution(String[] gems) {
//		int[] answer = new int[2];
//		Set<String> set = new HashSet<>();
//		
//		int max = gems.length;
//		for(String s : gems)
//			set.add(s);
//		
//		if(set.size()==1)
//			return answer = new int[] {1,1};
//		Set<String> temp = new HashSet<>();
//		for(int i=0; i<=gems.length-set.size(); i++) {
//			temp.add(gems[i]);
//			for(int j=i+1; j<gems.length; j++) {
//				if(j-i>=max)
//					break;
//				temp.add(gems[j]);
//				if(temp.size() == set.size()) {
//					if(j-i < max) {
//						max = j-i;
//						answer[0] = i+1;
//						answer[1] = j+1;
//					}
//					break;
//				}
//			}
//			temp.clear();
//		}
//		return answer;
//	}
	
//	private static int[] solution(String[] gems) {
//		int[] answer = new int[2];
//		Set<String> set = new HashSet<>();
//		
//		for(String s : gems)
//			set.add(s);
//		
//		if(set.size()==1)
//			return answer = new int[] {1,1};
//		
//		for(int i=set.size(); i<=gems.length; i++) {
//			for(int j=0; j<=gems.length-i; j++) {
//				Set<String> temp = new HashSet<>();
//				for(int k=j; k<i+j; k++) {
//					temp.add(gems[k]);
//				}
//				if(temp.size() == set.size()) {
//					return answer = new int[] {j+1,i+j};
//				}
//			}
//		}
//		return answer;
//	}

}
