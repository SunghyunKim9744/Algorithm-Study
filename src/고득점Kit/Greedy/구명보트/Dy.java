package 고득점Kit.Greedy.구명보트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 8:40 ~ 9:25, 9:40 ~ 11:03
public class Dy {

	public static void main(String[] args) {
		int[] people1 = {70,50,80,50}, people2= {40,60,60,60,60};
		
		int limit1 = 100, limit2 = 100;
		
//		System.out.println(solution(people1,limit1));
		System.out.println(solution(people2,limit2));
		

	}

	//효율성 테스트 4 〉	통과 (9.91ms, 54MB) 테스트 1 〉	통과 (13.03ms, 55.7MB)
	private static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		int max = 0;
		for(int i=0; i<people.length; i++) {
			System.out.println(i);
			if(i + max >= people.length) {
				break;
			}
			for(int j=0; j<people.length; j++) {
				
				if(limit - people[i] >= people[people.length-1-max]) {
					answer++;
					max ++;
					break;
				}else {
					answer++;
					max++;
					if(max + i == people.length)
						break;
				}
			}
			
		}
		
		return answer;
	}
//	public int solution(int[] people, int limit) {
//  int answer = 0;
//	Arrays.sort(people);
//	List<Integer> list = new ArrayList<Integer>();
//	for(int key: people)
//		list.add(key);
//	
//	while(list.size()>0) {
//		int other = limit - list.get(0);
//		list.remove(0);
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(list.size()-1-i) <= other) {
//				list.remove(list.size()-1-i);
//				break;
//			}
//		}
//		answer++;
//	}
//	
//	return answer;
//}
}
