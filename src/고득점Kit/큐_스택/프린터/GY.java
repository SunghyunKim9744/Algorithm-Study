package 고득점Kit.큐_스택.프린터;

import java.util.LinkedList;
import java.util.List;

public class GY {

	public static void main(String[] args) {

		int[] p1 = { 2, 1, 3, 2 }, p2 = { 1, 1, 9, 1, 1, 1 };
		int l1 = 2, l2 = 0;

		System.out.println(solution(p1, l1));
		System.out.println(solution(p2, l2));

	}

	// 0.45ms~8.11ms
	public static int solution(int[] priorities, int location) {
		int answer = 0;

		List<Prints> list = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			list.add(new Prints(i, priorities[i]));
		}

		while (!list.isEmpty()) {
			Prints p = list.get(0);
			
			boolean isRemoved = false;
			for (int i = 1; i < list.size(); i++) {
				if (p.importance < list.get(i).importance) {
					// 중요도 높은게 있으면 맨 뒤로 보내기
					list.remove(0);
					list.add(p);
					isRemoved = true;
					break;
				}
			}
			
			if(isRemoved)
				continue;

			int maxImportance = 0;
			for (Prints print : list)
				if (print.importance > maxImportance)
					maxImportance = print.importance;

			if (list.get(0).location == location)
				break;

			if (list.get(0).importance == maxImportance) {
				list.remove(0);
				answer++;
			}

		}

		return answer + 1;
	}

}

class Prints {

	int location;
	int importance;

	public Prints(int location, int importance) {
		this.location = location;
		this.importance = importance;
	}

	@Override
	public String toString() {
		return "Prints [location=" + location + ", importance=" + importance + "]";
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