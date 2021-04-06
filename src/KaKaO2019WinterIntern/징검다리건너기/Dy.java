package KaKaO2019WinterIntern.징검다리건너기;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {
		
		int[] s = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
		int k = 3;
		System.out.println(solution(s,k));

	}
	
//	public int solution(int[] stones, int k) {
//        int answer = 0;
//        while(true) {
//        	int num = k;
//        	for(int i=0; i<stones.length; i++) {
//        		if(stones[i] != 0) {
//        			stones[i]--;
//        			num = k;
//        		}else {
//        			num--;
//        			if(num == 0) {
//        				return answer;
//        			}
//        		}
//        	}
//        	answer++;
//        }
//    }

	private static int solution(int[] stones, int k) {
        int answer = 200000000;

    	int max = 0;
        for(int i=0; i<stones.length-k+1; i++) {
        	int temp = 0;
        	if(i == 0) {
        		for(int j=i; j<i+k; j++) {
	        		if(stones[j] > temp) {
	        			temp = stones[j];
	        		}
	        	}
        		if(answer > temp) {
	        		answer = temp;
	        	}
	        	
	        	max = temp;
        	}
        	if(i !=0 && stones[i-1] == max) {
	        	for(int j=i; j<i+k; j++) {
	        		if(stones[j] > temp) {
	        			temp = stones[j];
	        		}
	        	}
	        	if(answer > temp) {
	        		answer = temp;
	        	}
	        	
	        	max = temp;
	        	
        	}
        }
        return answer;
    }
	
//	private static int solution(int[] stones, int k) {
//        int answer = 200000000;
//        List<Integer> list = new ArrayList<Integer>();
//    	int max = 0;
//        for(int i=0; i<stones.length-k+1; i++) {
//        	int temp = 0;
//        	if(i == 0) {
//        		for(int j=i; j<i+k; j++) {
//	        		if(stones[j] > temp) {
//	        			temp = stones[j];
//	        			list.clear();
//	        			list.add(j);
//	        		}else if(stones[j] == temp) {
//	        			list.add(j);
//	        		}
//	        	}
//        		if(answer > temp) {
//	        		answer = temp;
//	        	}
//	        	
//	        	max = temp;
//        	}
//        	if(!list.isEmpty() && i > list.get(0))
//        		list.remove(0);
//        	
//        	if(list.isEmpty()) {
//	        	for(int j=i; j<i+k; j++) {
//	        		if(stones[j] > temp) {
//	        			temp = stones[j];
//	        			list.clear();
//	        			list.add(j);
//	        		}else if(stones[j] == temp) {
//	        			list.add(j);
//	        		}
//	        	}
//	        	if(answer > temp) {
//	        		answer = temp;
//	        	}
//	        	
//	        	max = temp;
//	        	
//        	}
//        }
//        return answer;
//    }
	
//	private static int solution(int[] stones, int k) {
//        int answer = 0;
//        List<Integer> list = new LinkedList<Integer>();
//        for(int i=0; i<k; i++) {
//        	list.add(stones[i]);
//        }
//        answer = Collections.max(list);
//        for(int i=k; i<stones.length-k+1; i++) {
//        	list.remove(0);
//        	list.add(stones[i]);
//        	int temp = Collections.max(list);
//        	if(answer > temp)
//        		answer = temp;
//        }
//        return answer;
//    }

}
