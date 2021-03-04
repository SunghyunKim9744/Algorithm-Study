package 고득점Kit.큐_스택.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int[] p1 = { 93, 30, 55 }, p2 = { 95, 90, 99, 99, 80, 99 };
		int[] s1 = { 1, 30, 5 }, s2 = { 1, 1, 1, 1, 1, 1 };

		System.out.println(solution(p1, s1));
		System.out.println(solution(p2, s2));
	}

	// 7:40 ~ 7:50
	// (3.01ms, 52MB) - > (8.64ms, 52.4MB)
	public static int[] solution(int[] progresses, int[] speeds) {

		int[] answer = null;
		
		Queue<Integer[]> queue = new LinkedList<>();
		List<Integer> answerList = new ArrayList<>();
		for(int i=0; i<speeds.length; i++)
			queue.offer(new Integer[] {progresses[i],speeds[i]});
		
		while(!queue.isEmpty()) {
			for(Integer[] arr : queue)
				arr[0]+=arr[1];
			if(queue.peek()[0]>=100) {
				int count = 1;
				queue.poll();
				while(!queue.isEmpty() && queue.peek()[0]>=100) {
					queue.poll();
					count++;
				}
				answerList.add(count);
			}
		
		}

//		answer = new int[answerList.size()];
//		for(int i=0; i<answer.length; i++)
//			answer[i] = answerList.get(i);
		return answerList.stream().mapToInt(i->i).toArray();
	}

}
