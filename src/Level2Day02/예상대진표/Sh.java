package Level2Day02.예상대진표;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sh {

	public static void main(String[] args) {
		int n = 8;
		int a = 3;
		int b = 7;
		
		int answer = solution(n,a,b);

	}

	private static int solution(int n, int a, int b) {
		   int answer = 1;
			
			int temp = 0;
			if(b > a) {
				temp = a;
				a = b;
				b = temp;
			}
			while(!(a-b == 1 && a%2==0)) {
				
				a = a%2 ==0 ? a/2 : (a+1)/2;
				b = b%2 ==0 ? b/2 : (b+1)/2;
				answer++;
			}
			
			return answer;
	}

}
