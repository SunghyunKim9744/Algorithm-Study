package 고득점Kit.힙.더맵게;

import java.util.PriorityQueue;

// 10:03 ~ 10:17
public class Dy {

	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int k = 1000;

		System.out.println(solution(scoville, k));

	}
	// 효율성 테스트 4 〉	통과 (125.86ms, 64.3MB) 테스트 5 〉	통과 (1646.63ms, 127MB)
	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int key: scoville)
			queue.add(key);
		
		while(queue.peek() < K) {
			int min1 = queue.poll();
			if(queue.isEmpty())
				return -1;
			
			int min2 = queue.poll();
			int mix = min1 + (min2 * 2);
			queue.add(mix);
			answer++;
		}
		return answer;
	}

}
