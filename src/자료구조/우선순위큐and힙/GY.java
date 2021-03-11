package 자료구조.우선순위큐and힙;

import java.util.Collections;
import java.util.PriorityQueue;

public class GY {

	// 우선순위 큐
	// : 우선순위가 가장 높은 데이터를 가장 먼저 삭제하는 자료구조

	// 구현 방법 : 1. 리스트를 이용하여 구현 2. 힙을 이용하여 구현

	// 데이터의 개수가 N개일 때 구현 방식에 따라서 다음과 같은 시간복잡도를 갖는다
	// 리스트 : 삽입시간 O(1), 삭제시간 O(N)
	// 힙 : 삽입시간 )(logN), 삭제시간 O(logN)

	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		minHeap.add(5);
		minHeap.add(1);
		minHeap.add(2);
		minHeap.add(7);
		minHeap.add(9);
		minHeap.add(8);
		minHeap.add(3);
		minHeap.add(5);

		System.out.println(minHeap);
		while (!minHeap.isEmpty())
			System.out.println(minHeap.poll());
		

		System.out.println("===============================");
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		maxHeap.add(5);
		maxHeap.add(1);
		maxHeap.add(2);
		maxHeap.add(7);
		maxHeap.add(9);
		maxHeap.add(8);
		maxHeap.add(3);
		maxHeap.add(5);

		while (!maxHeap.isEmpty())
			System.out.println(maxHeap.poll());

	}

}
