package 고득점Kit.큐_스택.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

//12:46 ~ 1:45
public class Dy {

	public static void main(String[] args) {
		int b1 = 2, b2 = 100, b3 = 100;
		int w1 = 10, w2 = 100, w3 = 100;
		int[] t1 = { 7, 4, 5, 6 }, t2 = { 10 }, t3 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(solution(b2, w2, t2));
	}
	// 테스트 14 〉	통과 (0.19ms, 52.3MB) 테스트 5 〉	통과 (27.41ms, 52.8MB)
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int bridgeWeight = 0;
		Queue<Integer> bridge = new LinkedList<Integer>();
		Queue<Integer> truckWeight = new LinkedList<Integer>();
		Queue<Integer> truckTime = new LinkedList<Integer>();
		int time = 0;
		int finish = 0;
		for(int key: truck_weights)
			truckWeight.offer(key);
		
		while(finish < truck_weights.length) {
			time++;
			if(!truckTime.isEmpty() && time -truckTime.peek() == bridge_length) {
				bridgeWeight -= bridge.poll();
				truckTime.poll();
				finish++;
			}
			if(!truckWeight.isEmpty() && bridgeWeight + truckWeight.peek() <= weight) {
				bridgeWeight += truckWeight.peek();
				bridge.offer(truckWeight.poll());
				truckTime.offer(time);
			}
			
		}
		
		answer = time;		
		
        return answer;
	}

}
