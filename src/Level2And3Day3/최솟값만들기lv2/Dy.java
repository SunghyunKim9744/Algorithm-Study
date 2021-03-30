package Level2And3Day3.최솟값만들기lv2;

import java.util.Arrays;

public class Dy {

	public static void main(String[] args) {
		int[] A1 = { 1, 4, 2 }, B1 = { 5, 4, 4 };
		int[] A2 = { 1, 2 }, B2 = { 3, 4 };

		System.out.println(solution(A1, B1));
		System.out.println(solution(A2, B2));

	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		int max = A.length;
		for(int i=0; i<max; i++) {
			answer += A[i] * B[max-1-i];
		}
		return answer;
	}

}
