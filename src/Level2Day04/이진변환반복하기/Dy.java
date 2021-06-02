package Level2Day04.이진변환반복하기;

import java.util.LinkedList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {

		int n = 5;
		solution(n);
	}
	
	public static int[] solution(int n) {
        int[] answer = {};
        
        List<List<Integer>> list = new LinkedList<>();
        int num = 1;
        int max = 0;
        int leng = 0;
        boolean left = true;
        for(int i = 0; i<n+1; i++) {
        	max += i;
        }
        
        
        if(left) {
            for(int i = 0; i<n; i++) {
            	list.get(i).add(leng,num);
            }
        }else {
        	
        }
        
        
        return answer;
    }

}
