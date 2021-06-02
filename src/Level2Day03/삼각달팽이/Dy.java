package Level2Day03.삼각달팽이;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {

		int n = 5;
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(int n) {
        int[] answer = {};
        
        List<List<Integer>> list = new LinkedList<>();
        int num = 1;
        int step = 0;
        int total = 0;
        for(int i = 0; i<n; i++) {
        	list.add(new LinkedList<Integer>());
        	total += i+1;
        }
        
        for(int i = 0; i<n; i++) {
        	
        	if(step % 3 == 0) {
            	for(int j = 0; j<n-i; j++) {
            		list.get(j+(step/3)*2).add(step/3,num);
            		num++;
            	}
            	step++;
        	}else if(step % 3 == 1) {
        		for(int j = 0; j<n-i; j++) {
            		list.get(n-1-step/3).add((step/3)+1+j,num);
            		num++;
            	}
        		step++;
        	}else {
        		for(int j = 0; j<n-i; j++) {
        			list.get(n-2-step/3 - j).add(list.get(n-2-step/3 - j).size() - step/3,num);
            		num++;
            	}
        		step++;
        	}
        	answer = new int[total];
            int ansNum = 0;
            for(int k = 0; k<n; k++) {
            	for(Integer key: list.get(k)) {
            		answer[ansNum] = key;
            		ansNum++;
            	}
            }
            System.out.println(Arrays.toString(answer));
        }
        
        
        return answer;
    }

}
