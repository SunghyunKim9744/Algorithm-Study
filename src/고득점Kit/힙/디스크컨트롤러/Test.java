package 고득점Kit.힙.디스크컨트롤러;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
	
		Queue<Integer> qu = new PriorityQueue<Integer>();
		
		qu.offer(5);
		qu.offer(6);
		qu.offer(4);
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		
		System.out.println("우선 순위");
		for(Iterator<Integer> itr = qu.iterator(); itr.hasNext();)
			System.out.println(itr.next());
		System.out.println("---------------");
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		
		
		System.out.println("---------------");
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("for-each");
		int cnt=0;
		for(Integer i : list) {
			System.out.println("list");
			if(i>2)
				list.remove(cnt);
			cnt++;
		}
		
		System.out.println(list);
		
		list.clear();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			System.out.println("listz");
			if(itr.next()>2)
				itr.remove();
		}
		
		System.out.println(list);
		
		
		

	}

}
