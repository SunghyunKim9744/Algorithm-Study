package 고득점Kit.힙.디스크컨트롤러;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// 10:19 ~ 12~17
public class Dy {

	public static void main(String[] args) {
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		System.out.println(solution(jobs));
	}
	// 테스트 16 〉	통과 (1.04ms, 52.4MB)  테스트 10 〉	통과 (26.17ms, 53MB)
	public static int solution(int[][] jobs) {
		int answer = 0;
		int time = 0;
		
		Arrays.sort(jobs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] - o2[1] == 0) {
					return o1[0] - o2[0];
				}
				return o1[1]-o2[1];
			}
		});
		int index = 0;
		int[] loading = new int[2];
		int loadingTime = 0;
		boolean load = false;
		while(true) {

			for(int i=index; i<jobs.length; i++) {
				if(jobs[i][0] != time)
					break;
				queue.add(jobs[i]);
				index++;
			}
			while(!queue.isEmpty() && loadingTime == 0) {
				if(load)
					answer += time - loading[0];
				loading = queue.poll();
				loadingTime = loading[1];
				load = true;
			}
			
			if(queue.isEmpty() && loadingTime == 0 && jobs[jobs.length-1][0] < time) {
				answer += time - loading[0];
				break;
			}
			if(loadingTime> 0)
				loadingTime--;
			time++;
		}
		answer /= jobs.length;
		return answer;
	}

}
