package 고득점Kit.큐_스택.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 12:01 ~ 12:43
public class Dy {

	public static void main(String[] args) {
		int[] p1 = { 93, 30, 55 }, p2 = { 95, 90, 99, 99, 80, 99 };
		int[] s1 = { 1, 30, 5 }, s2 = { 1, 1, 1, 1, 1, 1 };

		System.out.println(solution(p1, s1));
		System.out.println(solution(p2, s2));
	}
	// 테스트 1 〉	통과 (0.15ms, 52.6MB) 테스트 2 〉	통과 (0.38ms, 51.9MB)
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		int day = 0;
		Queue<Integer> pro = new LinkedList<Integer>();
		Queue<Integer> spd = new LinkedList<Integer>();
		for (Integer key : progresses)
			pro.offer(key);

		for (Integer key : speeds)
			spd.offer(key);

		List<Integer> list = new ArrayList<Integer>();
		while (!pro.isEmpty()) {
			day++;
			int num = 0;
			while(!pro.isEmpty() && pro.peek() + spd.peek() * day >= 100) {
				pro.poll();
				spd.poll();
				num++;
			}
			if(num != 0)
				list.add(num);
		}
		
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);

		return answer;
	}
}
