package 고득점Kit.힙.이중우선순위큐;

import java.util.Collections;
import java.util.PriorityQueue;

// 12:40 ~ 1:15
public class Dy {

	public static void main(String[] args) {

		String[] operations1 = { "I 16", "D 1" }, operations2 = { "I 7", "I 5", "I -5", "D -1" };
				

		solution(operations1);
//		solution(operations2);
	}
	// 테스트 4 〉	통과 (0.54ms, 52.3MB) 테스트 3 〉	통과 (0.74ms, 52.3MB)
	public static int[] solution(String[] operations) {
		int[] answer = {};
		answer = new int[2];
		PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> min = new PriorityQueue<Integer>();
		int num = 0;
		for(String key: operations) {
			String[] temp = key.split(" ");
			int value = Integer.parseInt(temp[1]);
			if(temp[0].equals("I")) {
				max.add(value);
				min.add(value);
				num++;
			}else if(num > 0){
				if(value == 1) {
					max.remove();
					num--;
				}else {
					min.remove();
					num--;
				}
			}
			
			if(num == 0) {
				max.clear();
				min.clear();
			}
		}
		
		if(num !=0) {
			answer[0] = max.peek();
			answer[1] = min.peek();
			
		}
		return answer;
	}

}
