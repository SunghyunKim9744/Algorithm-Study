package Day4.정수제곱근판별;

public class Dy {

	public static long solution(long n) {
        long answer = 0;
        long low = 0;
        long high = 7071067;
        long num = 0;
        long square = 0;
        answer = -1;
        
        while(high-low != 1) {
	        num = (low + high) / 2;
	        square = num * num;
	        if(square == n) {
	        	answer = (num+1) * (num+1);
	        	break;
	        }else if(square > n) {
	        	high = num;
	        }else if(square < n) {
	        	low = num;
	        }
        }
        
        return answer;
    }
}
