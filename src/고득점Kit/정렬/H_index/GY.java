package 고득점Kit.정렬.H_index;

import java.util.Arrays;

public class GY {

	public static void main(String[] args) {
//		int[] citations = { 4, 0, 6, 1, 5 };
//		int[] citations = { 0, 1, 3, 5, 7, 9, 10 };
//		int[] citations = { 2, 2 };
		int[] citations = { 2 };
		System.out.println(solution(citations));
	}

	// 3:33 ~ 4:15 
	// 0.49ms ~ 12.31ms
	public static int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);

		for (int i = 0; i <= citations[citations.length - 1]; i++) {
			int count = 0;
			for (int j = 0; j < citations.length; j++) {
				if (citations[j] >= i)
					count++;
			}

			if (count >= i)
				answer = i;
			else
				break;

		}

		return answer;

	}

}

//public int solution(int[] citations) {
//int answer = 0;
//Arrays.sort(citations);
//
//for (int i = 0; i < citations.length; i++) {
//	if (citations[i] >= citations.length-i) {
//		answer = citations.length-i;
//		break;
//	}
//}
//
//return answer;
//}
