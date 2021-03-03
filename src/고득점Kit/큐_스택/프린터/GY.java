package 고득점Kit.큐_스택.프린터;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GY {

	public static void main(String[] args) {

		int[] p1 = { 2, 1, 3, 2 }, p2 = { 1, 1, 9, 1, 1, 1 };
		int l1 = 2, l2 = 0;

		System.out.println(solution(p1, l1));
		System.out.println(solution(p2, l2));

	}

	// 9:30 ~
	public static int solution(int[] priorities, int location) {
		int answer = 0;

//		Map<Integer, Integer> map = new HashMap<>();
//		Queue<Map<Integer, Integer>> queue = new LinkedList<>();
//		for (int i = 0; i < priorities.length; i++) {
//			// key : 인덱스, value : 우선순위
//			map.put(i, priorities[i]);
//		}
//		
//		for(Entry<Integer, Integer> entry : map.entrySet())
//			queue.offer(entry);

		List<Prints> queue = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++)
			queue.add(new Prints(i, priorities[i]));

//		Collections.sort(queue);

		for (Prints p : queue)
			System.out.println(p.toString());

		return answer;
	}

}

class Prints implements Comparator<Prints> {
	int order;
	int importance;

	public Prints(int order, int importance) {
		this.order = order;
		this.importance = importance;
	}

	@Override
	public String toString() {
		return "Prints [order=" + order + ", importance=" + importance + "]";
	}

	@Override
	public int compare(Prints o1, Prints o2) {
		return o1.importance - o2.importance;
	}

}

//public int solution(int[] priorities, int location) {
//    int answer = 1;
//    PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
//    
//    for(int i : priorities) {
//    	pq.add(i);
//    	System.out.println(pq);
//    }
//    
//    while(!pq.isEmpty()) {
//    	for(int i = 0;i<priorities.length;i++) {
//    		if(priorities[i] == (int)pq.peek()) {
//    			if(i == location) {
//    				return answer;
//    			}
//    			pq.poll();
//    			answer++;
//    		}
//    	}
//    }
//    return answer;
//}