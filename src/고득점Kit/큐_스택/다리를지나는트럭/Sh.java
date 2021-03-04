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
	// (0.29ms, 52MB) - > (67.71ms, 63MB)
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		
		Queue<int[]> waitQueue = new LinkedList<>();
		
		for(int i=0; i<truck_weights.length; i++) 
			waitQueue.offer(new int[] {truck_weights[i],0});
		
		
		Queue<int[]> finishQueue = new LinkedList<>();
		Queue<int[]> goingQueue = new LinkedList<>();
		
		int totalWeight = 0;
		while(finishQueue.size() != truck_weights.length) {
			for(int[] i : goingQueue)
				i[1]+=1;
			if(goingQueue.size() != 0) {
				if(goingQueue.peek()[1] == bridge_length) {
					int[] temp = goingQueue.poll();
					finishQueue.offer(temp);
					totalWeight-=temp[0];
				}
			}
			
			if(waitQueue.size() != 0) {
				if(waitQueue.peek()[0]+totalWeight <= weight) {
					int[] temp = waitQueue.poll();
					goingQueue.offer(temp);
					totalWeight+=temp[0];
				}
			}
			
			
			
			
			
			answer++;
			
//			System.out.println("다리를 지난 트럭");
//			for(int[] i : finishQueue)
//				System.out.println(i[0]+" : "+i[1]);
//			System.out.println("다리를 건너는 트럭");
//			for(int[] i : goingQueue)
//				System.out.println(i[0]+" : "+i[1]);
//			System.out.println("대기 트럭");
//			for(int[] i : waitQueue)
//				System.out.println(i[0]+" : "+i[1]);
		}
		return answer;
	}
	

}

