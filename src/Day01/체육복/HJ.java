package Day01.체육복;

import java.util.Arrays;
import java.util.List;

public class HJ {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 1, -1, 4, -1 };
		int[] reserve = { -1, 3, -1 };

		System.out.printf("-------------------\n%d", solution(n, lost, reserve));
	}

//	public static int solution(int n, int[] lost, int[] reserve) {
//		int answer = 0;
//		answer = n - lost.length;
//
//		for (int i = 0; i < reserve.length; i++) {
//			for (int j = 0; j < lost.length; j++) {
//				
//				int key = reserve[i] - lost[j];
//
//				if (key != 0)
//					continue;
//				
//				answer++;
//				lost[j] = -1;
//				reserve[i] = -1;
//			}
//		
//			if (reserve[i] < 0 || lost[i] < 0)
//				continue;
//		}
//
//		return answer;
//	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		answer = n - lost.length;
		Arrays.asList(lost).stream();

		// 여분 == 도난 처리
		for (int r : reserve)
			for (int l : lost)
				if (r == l) {
					answer++;
					
					// 요소 제거 후 배열 생성
					int[] tempL = new int[lost.length - 1];
					int[] tempR = new int[reserve.length - 1];

					for (int i = 0, j = 0; i < lost.length; i++) {
						if (l == lost[i])
							continue;
						
						tempL[j] = lost[i];
						j++;
					}

					for (int i = 0, j = 0; i < reserve.length; i++) {
						if (r == reserve[i])
							continue;
						
						tempR[j] = reserve[i];
						j++;
					}

					lost = tempL;
					reserve = tempR;
				}
		
		// 그 외
		for (int r : reserve)
			EXIT:
			for (int l : lost) {
				int key = r > l ? r - l : l - r;

				if (key == 1) {
					answer++;
					
					// 요소 제거 후 배열 생성
					int[] tempL = new int[lost.length - 1];
					for (int i = 0, j = 0; i < lost.length; i++) {
						if (l == lost[i])
							continue;
						
						tempL[j] = lost[i];
						j++;
					}
					lost = tempL;

					break EXIT;
				}
			}

		return answer;
	}
}
