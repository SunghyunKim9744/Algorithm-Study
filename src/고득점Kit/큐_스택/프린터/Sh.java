package 고득점Kit.큐_스택.프린터;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Sh {

	public static void main(String[] args) {

		int[] p1 = {2,1,3,2}, p2 = { 1, 1, 9, 1, 1, 1 };
		int l1 = 2, l2 = 0;

		System.out.println(solution(p1, l1));
		System.out.println(solution(p2, l2));

	}

	// (0.08ms, 52.8MB) - > (4.55ms, 52.9MB)
	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		Deque<int[]> bowlDeq = new ArrayDeque<>();
		Deque<int[]> answerDeq = new ArrayDeque<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<priorities.length; i++) {
			list.add(priorities[i]);
			bowlDeq.offerLast(new int[] {i,priorities[i]});
		}
		
		
		while(!bowlDeq.isEmpty()) {
			int[] temp = bowlDeq.pollFirst();
			boolean bigger = false;
			int index = 0;
			for(int i=0; i<list.size()-1; i++)
				if(temp[1] < list.get(i+1)) {
					bigger = true;
					index = i;
					break;
				}

			if(bigger) {
				bowlDeq.offerLast(temp);
				list.remove(index);
				list.add(temp[1]);
			}
			else {
				answerDeq.offerLast(temp);
				list.remove(0);
			}
		}
	
		int index = 1;
		for(int[] arr : answerDeq) {
			if(arr[0] == location)
				return index;
			index++;
		}


		return answer;
	}

}

