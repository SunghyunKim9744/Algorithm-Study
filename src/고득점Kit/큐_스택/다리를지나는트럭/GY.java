package 고득점Kit.큐_스택.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class GY {

	public static void main(String[] args) {
		int b1 = 2, b2 = 100, b3 = 100;
		int w1 = 10, w2 = 100, w3 = 100;
		int[] t1 = { 7, 4, 5, 6 }, t2 = { 10 }, t3 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(solution(b1, w1, t1));
		System.out.println(solution(b2, w2, t2));
		System.out.println(solution(b3, w3, t3));
	}

	// 1시간?
	// 0.54ms~53.19ms
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		Queue<Truck> waiting = new LinkedList<>();
		Queue<Truck> bridge = new LinkedList<>();

		for (int i : truck_weights) {
			waiting.add(new Truck(i, 0));
		}

		int sum = 0; // 다리에 있는 트럭 무게의 합
		while (!waiting.isEmpty() || !bridge.isEmpty()) {

			if (!waiting.isEmpty() && sum + waiting.peek().truckWeight <= weight) {
				bridge.offer(new Truck(waiting.peek().truckWeight, waiting.peek().time));
				sum += waiting.peek().truckWeight;
				waiting.poll();
			}

			if (!bridge.isEmpty()) {
				for (Truck t : bridge) {
					t.time++;
					// 왜 여기있으면 오류나지..?
//					if (t.time == bridge_length) {
//						sum -= bridge.peek().truckWeight; // 트럭이 도착하면 무게를 빼준다.
//						bridge.poll();
//					}
				}

				Truck t = bridge.peek();
				if (t.time == bridge_length) {
					sum -= bridge.peek().truckWeight; // 트럭이 도착하면 무게를 빼준다.
					bridge.poll();
				}

			}

//			System.out.println(bridge);
			answer++;
		}
		// 왜 1 더해야하지..?
		return answer + 1;
	}

}

class Truck {
	int truckWeight;
	int time;

	public Truck(int truckWeight, int time) {
		super();
		this.truckWeight = truckWeight;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Truck [truckWeight=" + truckWeight + ", time=" + time + "]";
	}

}