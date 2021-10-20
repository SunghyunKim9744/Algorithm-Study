package D_1011.백준_13913_숨바꼭질;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String[] nums = sc.nextLine().split(" ");
		
		int A = 5;
		int B = 22;
		int answer = solution2(A,B,0);
		
		System.out.println(answer);

	}
	
	public static int solution2(int A, int B, int cnt) {
		int answer = 9999999;
		
		if(A == B) {
			return cnt;
		}
		
		if(Math.abs(A - (B / 2)) < Math.abs(A - B)) {
			if(B % 2 == 0) {
				int temp = solution2(A, B/2, cnt + 1);
				if(answer>temp) {
					answer = temp;
				}
			}else {
				int temp = solution2(A, (B+1)/2, cnt + 2);
				int temp2 = solution2(A, (B-1)/2, cnt + 2);
				if(answer>temp) {
					answer = temp;
				}
				if(answer>temp2) {
					answer = temp2;
				}
			}
		}
		return answer;
		
	}

}
