package Level2And3Day3.최솟값만들기lv2;

import java.util.Arrays;

public class GY {

	public static void main(String[] args) {
		int[] A1 = { 1, 4, 2 }, B1 = { 5, 4, 4 };
		int[] A2 = { 1, 2 }, B2 = { 3, 4 };

		System.out.println(solution(A1, B1));
		System.out.println(solution(A2, B2));

	}

	// 4 : 13 ~ 4 : 19
	// 효율성 1.13ms ~ 3.20ms
	public static int solution(int[] A, int[] B) {
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B/* , Collections.reverseOrder() */); // 역순 정렬 하려면 wrapper class로 배열 만들어야함

		int n = A.length;
		for (int i = 0; i < n; i++) {
			answer += A[i] * B[n - 1 - i];
		}

		return answer;
	}

}

//public int solution(int []A, int []B)
//{
//    int answer = 0;
//    
//    Arrays.sort(A);
//	Arrays.sort(B);
//
//	for (int i = 0; i < A.length; i++) {
//		answer += A[i] * B[B.length - i - 1];
//	}
//
//    return answer;
//}
