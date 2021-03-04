package 고득점Kit.큐_스택.프린터;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 1:47 ~ 2:21
public class Dy {

	public static void main(String[] args) {

		int[] p1 = { 2, 1, 3, 2 }, p2 = { 1,1,9, 1, 1, 1, };
		int l1 = 2, l2 = 0;

		System.out.println(solution(p1, l1));
		System.out.println(solution(p2, l2));

	}
	// 테스트 4 〉	통과 (0.46ms, 53.2MB) 테스트 12 〉	통과 (3.54ms, 53.1MB)
	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		Queue<Integer> print = new LinkedList<Integer>();
		for(int i=0; i<priorities.length; i++) {
			print.offer(priorities[i]);
		}
		
		Queue<Integer> big = new LinkedList<Integer>();
		Arrays.sort(priorities);
		for(int i=0; i<priorities.length; i++) {
			big.offer(priorities[priorities.length-1-i]);
		}
		while(true) {
			if(print.peek() < big.peek()) {
				if(location == 0) {
					location = print.size()-1;
				}
				print.offer(print.poll());
			}else {
				print.poll();
				big.poll();
				answer++;
				if(location == 0) {
					return answer;
				}
			}
			location--;
		}
	}

}
