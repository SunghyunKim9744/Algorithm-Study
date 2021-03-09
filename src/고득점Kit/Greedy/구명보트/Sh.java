package 고득점Kit.Greedy.구명보트;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {
		int[] people1 = {70,50,80,50}, people2= {70,80,50};
		
		int limit1 = 100, limit2 = 100;
		
		System.out.println(solution(people1,limit1));
		System.out.println(solution(people2,limit2));

	}

	//
//	private static int solution(int[] people, int limit) {
//		int answer = 0;
//		
//		Arrays.sort(people);
//		int minWeight = people[0];
//		List<Integer> list = new ArrayList<>();
//		for(int i=0; i<people.length; i++) {
//			if(people[i]+minWeight>limit)
//				answer++;
//			else
//				list.add(people[i]);
//		}
//		
//		for(int i=0; i<list.size()-1; i++) {
//			int index = -1;
//			int temp = list.get(i);
//			for(int j=list.size()-1; j>0; j--) {
//				if(temp+list.get(j)<=limit) {
//					index = j;
//					break;
//				}
//				if(i==j)
//					break;
//			}
//			
//			if(index == -1)
//				break;
//			list.remove(index);
//			list.remove(i);
//			i--;
//			answer++;
//		}
//		
//		return answer+list.size();
//	}
	
	private static int solution(int[] people, int limit) {
		int answer = 0;
		
		int len = people.length;
		Arrays.sort(people);
		int small = 0;
		int big = len-1;
		
		while(small<=big) {
			
			if(people[small]+people[big]<=limit) 
				small++;
			
			big--;
			answer++;
			
	
		}
		
		
		return answer;
	}

}
