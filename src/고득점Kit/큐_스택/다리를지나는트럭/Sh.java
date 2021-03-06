package 고득점Kit.큐_스택.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int b1 = 2, b2 = 100, b3 = 100;
		int w1 = 10, w2 = 100, w3 = 100;
		int[] t1 = { 7, 4, 5, 6 }, t2 = { 10 }, t3 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(solution(b1, w1, t1));
		System.out.println(solution(b2, w2, t2));
		System.out.println(solution(b3, w3, t3));

	}

	// 5:04 ~ 6:05
	// (0.32ms, 52.4MB) - > (56.36ms, 63.1MB)
//	public static int solution(int bridge_length, int weight, int[] truck_weights) {
//
//		int answer = 0;
//
//		Queue<Integer> waitQueue = new LinkedList<>();
//
//		for (int i = 0; i < truck_weights.length; i++)
//			waitQueue.offer(truck_weights[i]);
//
//		Queue<Integer> finishQueue = new LinkedList<>();
//		Queue<int[]> goingQueue = new LinkedList<>();
//
//		int totalWeight = 0;
//		while (finishQueue.size() != truck_weights.length) {
//			for (int[] i : goingQueue)
//				i[1] += 1;
//
//			if (!goingQueue.isEmpty() && goingQueue.peek()[1] == bridge_length) {
//				int temp = goingQueue.poll()[0];
//				finishQueue.offer(temp);
//				totalWeight -= temp;
//			}
//			if (!waitQueue.isEmpty() && waitQueue.peek() + totalWeight <= weight) {
//				int temp = waitQueue.poll();
//				goingQueue.offer(new int[] {temp,0});
//				totalWeight += temp;
//			}
//			answer++;
//
//		}
//		return answer;
//	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {

		int answer = 0;

		int totalWeight = 0;
		Queue<MyTruck> wait = new LinkedList<>();
		for (int i = 0; i < truck_weights.length; i++)
			wait.offer(new MyTruck(truck_weights[i], 0));

		Queue<MyTruck> going = new LinkedList<>();

		while (!(wait.isEmpty() && going.isEmpty())) {
			for (MyTruck t : going)
				t.move();

			if (!going.isEmpty() && going.peek().time == bridge_length) {
				totalWeight -= going.peek().weight;
				going.poll();
			}

			if (!wait.isEmpty() && wait.peek().weight + totalWeight <= weight) {
				totalWeight += wait.peek().weight;
				going.offer(wait.poll());
			}
			answer++;

		}

		return answer;
	}

}

class MyTruck {
	int weight;
	int time;

	public MyTruck(int weight, int time) {
		this.weight = weight;
		this.time = 0;
	}

	public void move() {
		this.time++;
	}
}
