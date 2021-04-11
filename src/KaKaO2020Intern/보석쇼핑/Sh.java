package KaKaO2020Intern.보석쇼핑;

import java.util.HashSet;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String[] gems = {"DIA","EM","EM","RUB","DIA"};
		
		int[] answer = solution(gems);
		for(int i : answer)
			System.out.println(i);
	
	}

	// 4:03
	private static int[] solution(String[] gems) {
		int[] answer = new int[2];
		Set<String> set = new HashSet<>();
		
		int max = gems.length;
		for(String s : gems)
			set.add(s);
		
		if(set.size()==1)
			return answer = new int[] {1,1};
		Set<String> temp = new HashSet<>();
		for(int i=0; i<=gems.length-set.size(); i++) {
			temp.add(gems[i]);
			for(int j=i+1; j<gems.length; j++) {
				if(j-i>=max)
					break;
				temp.add(gems[j]);
				if(temp.size() == set.size()) {
					if(j-i < max) {
						max = j-i;
						answer[0] = i+1;
						answer[1] = j+1;
					}
					break;
				}
			}
			temp.clear();
		}
		return answer;
	}
	
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
