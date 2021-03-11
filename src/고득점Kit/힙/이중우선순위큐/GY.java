package 고득점Kit.힙.이중우선순위큐;

import java.util.Collections;
import java.util.PriorityQueue;

public class GY {

	public static void main(String[] args) {

		String[] operations1 = { "I 16", "D 1" }, operations2 = { "I 7", "I 5", "I -5", "D -1" },
				operations3 = { "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1" },
				operations4 = { "I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6" };

		solution(operations1);
		solution(operations2);
		solution(operations3);
		solution(operations4);
	}

	// 3 : 05 ~ 4 :22
	// 0.63ms ~ 5.74ms
	public static int[] solution(String[] operations) {
		int[] answer = {};
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int count = 0;
		for (String s : operations) {
			String[] temp = s.split(" ");
			if (temp[0].equals("I")) { // 삽입하는 경우
				int i = Integer.parseInt(temp[1]);
				minHeap.add(i);
				maxHeap.add(i);
				count++;
			} else { // 삭제하는 경우
				if (temp[1].equals("1")) {
					if (maxHeap.size() == 0)
						continue;
					int j = maxHeap.poll();
					minHeap.remove(j);
					count--;
				} else {
					if (minHeap.size() == 0)
						continue;
					int j = minHeap.poll();
					maxHeap.remove(j);
					count--;
				}
			}
		}

		if (count <= 0)
			return new int[] { 0, 0 };

		System.out.println(minHeap);
		System.out.println(maxHeap);

		answer = new int[2];
		answer[0] = maxHeap.poll();
		answer[1] = minHeap.poll();
		return answer;
	}

}
