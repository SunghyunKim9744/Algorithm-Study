package Level2Day04.두개이하로다른비트;

import java.util.Arrays;

public class Dy {

	public static void main(String[] args) {

		long[] numbers = {1001,337,0,1,333,673,343,221,898,997,121,1015,665,779,891,421,222,256,512,128,100};
		System.out.println(Arrays.toString(solution(numbers)));

	}

	private static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	long num = 1;
        	long temp = numbers[i];
        	while(temp > 1) {
        		if(temp % 2 != 0) {
        			temp /=2;
        			num*=2;
        		}else {
        			if(num < 2) {
        				num = 2;
        			}
        			answer[i] = numbers[i] + num/2;
        			break;
        		}
        	}
        	if(answer[i] == 0)
        		answer[i] = numbers[i] + num;
        	
        }
        
        return answer;
    }

}
