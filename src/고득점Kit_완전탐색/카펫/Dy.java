package 고득점Kit_완전탐색.카펫;

// 2:09 ~ 2:17
public class Dy {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		System.out.println(solution(brown, yellow));
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = {};
        answer = new int[2];
        for(int i=1; i<yellow+1; i++) {
        	if(yellow % i == 0) {
        		if(brown == (yellow / i) * 2 + i * 2 + 4) {
        			answer[0] = i + 2;
        			answer[1] = (yellow / i) + 2;
        		}
        	}
        }
        return answer;
    }
}
