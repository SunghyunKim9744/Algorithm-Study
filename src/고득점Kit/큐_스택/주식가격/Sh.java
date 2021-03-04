package 고득점Kit.큐_스택.주식가격;

import java.util.LinkedList;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		System.out.println(solution(prices));
	}

	// 6:56 ~ 7:01
	// (11.54ms, 63.8MB) - > (21.87ms, 72.9MB)
//	public static int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//
//		for(int i=0; i<prices.length; i++) {
//			int temp = prices[i];
//			for(int j=i+1; j<prices.length; j++) {
//				answer[i]++;
//				if(temp>prices[j]) 
//					break;
//				
//					
//			}
//		}
//
//		return answer;
//	}
	
	// (29.04ms, 66.3MB) - > (40.59ms, 68.7MB)
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		Queue<Integer> pricesQueue = new LinkedList<>();
		for(int i=0; i<prices.length; i++)
			pricesQueue.offer(prices[i]);
		
		int index = 0;
		while(!pricesQueue.isEmpty()) {
			for(int i=index+1; i<prices.length; i++) {
				if(pricesQueue.peek() > prices[i]) {
					pricesQueue.poll();
					answer[index] = i-index;
					break;
				}
				if(i == prices.length-1) {
					pricesQueue.poll();
					answer[index] = i-index;
				}
			}
			if(answer[index] == 0)
				pricesQueue.poll();
			index++;
		}

		return answer;
	}

}