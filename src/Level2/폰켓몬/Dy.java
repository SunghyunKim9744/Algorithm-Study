package Level2.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Dy {

	public static void main(String[] args) {
		
		int[] a = {3,1,2,3};
		
		System.out.println(solution(a));

	}

	public static int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int key: nums) {
        	set.add(key);
        }
        
        if(set.size() > nums.length / 2) {
        	answer = nums.length / 2;
        }else {
        	answer = set.size();
        }
        
        return answer;
    }
}
