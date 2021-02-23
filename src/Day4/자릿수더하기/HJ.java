package Day4.자릿수더하기;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		int n = 100000000;
		System.out.println(solution(n));
	}

//	// 방법 1
//	public static int solution(int n) {
//        String[] numStrArr = String.valueOf(n).split("");
//        return Arrays.asList(numStrArr).stream().mapToInt(i -> Integer.valueOf(i)).sum();
//    }
	
	// 방법 2
	public static int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
        	answer += n % 10;
        	n /= 10;
        }
        
        return answer;
    }

}
