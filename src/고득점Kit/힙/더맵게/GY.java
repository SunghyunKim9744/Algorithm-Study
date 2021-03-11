package 고득점Kit.힙.더맵게;

import java.util.PriorityQueue;

public class GY {

	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int k = 7;

		System.out.println(solution(scoville, k));

	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (int i : scoville)
			heap.add(i);

		while (heap.peek() < K) {
			// 질문하기 참고
			if (heap.size() == 1)
				return -1;

			int first = heap.poll();
			int second = heap.poll();

			int third = first + second * 2;
			heap.add(third);
			answer++;

		}

		return answer;
	}

}
