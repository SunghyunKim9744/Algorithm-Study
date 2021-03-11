package 고득점Kit.힙.디스크컨트롤러;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int[][] jobs = 
			{{0, 3}, {1, 9}, {2, 6}, {4, 3}};
		System.out.println(solution(jobs));
	}

	// 3:29 ~ 
//	public static int solution(int[][] jobs) {
//		int answer = 0;
//		
//		Queue<int[]> diskListPrq = new PriorityQueue<>((arr1,arr2)->{
//			if(arr1[0]==arr2[0])
//				return arr1[1]-arr2[1];
//			return arr1[1]-arr2[1];
//		});
//		
//		
//		for(int[] arr : jobs)
//			diskListPrq.offer(arr);
//
//		
//		int currentTime = 0;
//		
//		while(!diskListPrq.isEmpty()) {
//			boolean bool = false;
//			for(Iterator<int[]> itr = diskListPrq.iterator(); itr.hasNext();) {
//				int[] temp = itr.next();
//				System.out.println(temp[0]+" : "+temp[1]);
//				if(temp[0]<=currentTime) {		
//					currentTime+=temp[1];
//					answer+=currentTime-temp[0];
//					itr.remove();
//					bool = true;
//					break;
//				}
//			}
//			if(!bool)
//				currentTime++;
//		}
//		return answer/jobs.length;
//	}
	
	public static int solution(int[][] jobs) {
		int answer = 0;
		
		List<int[]> list = new ArrayList<>();
		
		for(int[] arr : jobs)
			list.add(arr);
		
		list.sort((arr1,arr2)->{
			if(arr1[0]==arr2[0])
				return arr1[1]-arr2[1];
			return arr1[1]-arr2[1];
		});

		
		int currentTime = 0;
		
		while(!list.isEmpty()) {
			boolean bool = false;
			for(Iterator<int[]> itr = list.iterator(); itr.hasNext();) {
				int[] temp = itr.next();
				System.out.println(temp[0]+" : "+temp[1]);
				if(temp[0]<=currentTime) {		
					currentTime+=temp[1];
					answer+=currentTime-temp[0];
					itr.remove();
					bool = true;
					break;
				}
			}
			if(!bool)
				currentTime++;
		}
		return answer/jobs.length;
	}

}
