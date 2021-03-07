package 고득점Kit.Greedy.체육복;

import java.util.HashSet;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {

		int n1=5,n2=5,n3=3;
		int[] lost1 = {2,4},lost2 = {2,4}, lost3 = {3};
		int[] reserve1 = {1,3,5},reserve2 = {3}, reserve3= {1};
	
		System.out.println(solution(n1,lost1,reserve1));
		System.out.println(solution(n2,lost2,reserve2));
		System.out.println(solution(n3,lost3,reserve3));
	}

	// (0.05ms, 51.7MB) - > (0.11ms, 52.6MB)
//	private static int solution(int n, int[] lost, int[] reserve) {
//		int answer = 0;
//		
//		Set<Integer> set = new HashSet<>();
//		
//		for(int i : lost)
//			set.add(i);
//		
//		for(int i=0; i<reserve.length; i++) {
//			if(set.contains(reserve[i])) {
//				set.remove(reserve[i]);
//				reserve[i] = -1;
//			}
//		}
//		
//		for(int i=0; i<reserve.length; i++) {
//			if(set.contains(reserve[i]-1))
//				set.remove(reserve[i]-1);
//			else if(set.contains(reserve[i]+1))
//				set.remove(reserve[i]+1);
//		}
//		return n-set.size();
//	}
	
	// 학생의 번호를 인덱스로 나타내기!
	private static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] students = new int[n+2];
		
		for(int i : reserve)
			students[i] = 1;
		for(int i : lost)
			students[i]--;
		
		for(int i=1; i<n+1; i++) {
			if(students[i]== -1) {
				if(students[i-1] == 1) {
					students[i-1]=0;
					students[i] = 0;
					answer++;
				}
					
				else if(students[i+1] == 1) {
					students[i+1]=0;
					students[i] = 0;
					answer++;
				}
					
			}
			else
				answer++;
		}
		return answer;
	}

}
