package 고득점Kit.힙.더맵게;

import java.util.PriorityQueue;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {

		int[] scoville = {1,1 };
		int k = 3;

		System.out.println(solution(scoville, k));

	}

	// 3:10 ~ 3:18
	// (130.48ms, 65.4MB) - > (1557.81ms, 124MB)
	public static int solution(int[] scoville, int K) {
		int answer = 0;

		Queue<Integer> prqu = new PriorityQueue<>();
		for(int i : scoville)
			prqu.offer(i);
		
		int cnt = 0;

		while(prqu.size()!=1) {
			
			if(prqu.peek() >= K )
				return cnt;
			int min1 = prqu.poll();
			int min2 = prqu.poll();
			
			int mix = min1+min2*2;
			
			prqu.offer(mix);
			
			cnt++;
		}
		if(prqu.peek() < K)
			return -1;
		
		return cnt;
	}
	
//	public int solution(int[] scoville, int K) {
//        int answer = 0;
//        int[] scop;
//        Arrays.sort(scoville);
//        while(scoville[0]<K){
//            scop = new int[scoville.length-1];
//            scop[0] = scoville[0] + scoville[1]*2;
//            if(scop.length==1 && scop[0]<K){
//                return -1;
//            }
//            for(int i=1; i<scop.length; i++){
//                scop[i] = scoville[i+1]; 
//            }
//            Arrays.sort(scop);
//            scoville = scop;
//            answer++;
//        }
//        return answer;
//	}

}

