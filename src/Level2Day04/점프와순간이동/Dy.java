package Level2Day04.점프와순간이동;

import java.util.LinkedList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {

		int n = 5;
		solution(n);
	}
	
	public static int solution(int n) {
        int ans = 0;
        
        while(n != 0) {
        	while(n % 2 == 0) {
        		n /= 2;
        	}
        	n--;
        	ans++;
        }
        return ans;
    }

}
