package 고득점Kit.힙.이중우선순위큐;

import java.util.PriorityQueue;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {

		String[] operations1 = { "I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6" }, operations2 = { "I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333" };

		int[] answer = solution(operations1);
		for(int i : answer)
			System.out.println(i);
		solution(operations2);
	}

	// 4:42 ~ 5: 20
	// (0.88ms, 51.8MB) - > (1.21ms, 52.5MB)
	public static int[] solution(String[] operations) {
		int[] answer = {};
		
		Queue<Integer> maxPrqu = new PriorityQueue<>((n1,n2)->n2-n1);
		Queue<Integer> minPrqu = new PriorityQueue<>();

		int insertCnt = 0;
		int deleteCnt = 0;
		for(int i=0; i<operations.length; i++) {
			String str = operations[i];
			
			if(str.startsWith("I")) {
				int num = Integer.parseInt(str.split(" ")[1]);
				maxPrqu.offer(num);
				minPrqu.offer(num);
				insertCnt++;
			}
			else if(insertCnt > deleteCnt) {
				if(str.equals("D 1")) 
					minPrqu.remove(maxPrqu.poll());
				else 
					maxPrqu.remove(minPrqu.poll());
				deleteCnt++;

			}
		}

		answer = insertCnt == deleteCnt ? new int[] {0,0} : new int[] {maxPrqu.poll(),minPrqu.poll()};
		return answer;
	}

}
