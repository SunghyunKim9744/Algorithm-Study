package 고득점Kit.큐_스택.기능개발;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GY {

	public static void main(String[] args) {
		int[] p1 = { 93, 30, 55 }, p2 = { 95, 90, 99, 99, 80, 99 };
		int[] s1 = { 1, 30, 5 }, s2 = { 1, 1, 1, 1, 1, 1 };

		System.out.println(solution(p1, s1));
		System.out.println(solution(p2, s2));
	}

	// 11:33
	// 2.81ms 9.74ms
	// 스트림 안 쓰면 0.15ms ~ 0.30ms
	public static int[] solution(int[] progresses, int[] speeds) {

		int[] workDay = new int[progresses.length];

		for (int i = 0; i < progresses.length; i++)
			while (progresses[i] < 100) {
				workDay[i]++;
				progresses[i] += speeds[i];

			}

		Queue<Integer> queue = new LinkedList<Integer>(); // asList안되나?
		for (int i : workDay)
			queue.offer(i);

		List<Integer> answerList = new LinkedList<>();
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			int number = 1;
			while (!queue.isEmpty() && queue.peek() <= temp) {
				queue.poll();
				number++;
			}
			answerList.add(number);
		}

//		return answerList.stream().mapToInt(i -> i).toArray();
		int[] answer = new int[answerList.size()];

		for (int i = 0; i < answer.length; i++)
			answer[i] = answerList.get(i);

		return answer;
	}

}
