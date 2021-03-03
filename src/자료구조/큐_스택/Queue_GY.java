package 자료구조.큐_스택;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_GY {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(7); // queue에 값 1 추가
		queue.add(8); // queue에 값 2 추가
		queue.offer(9); // queue에 값 3 추가

		int a = queue.poll(); // queue에 첫번째 값을 반환하고 제거 비어있다면 null
		System.out.println(a); // 7
		int b = queue.remove(); // queue에 첫번째 값을 반환하고 제거 비어있다면 NoSuchElementException
		System.out.println(b); // 8
		queue.clear(); // queue 초기화

		queue.offer(1); // queue에 값 1 추가
		queue.offer(2); // queue에 값 2 추가
		queue.offer(3); // queue에 값 3 추가
		int c = queue.peek();
		int d = queue.peek();
		System.out.println(c);
		System.out.println(d);
		
	}

}
