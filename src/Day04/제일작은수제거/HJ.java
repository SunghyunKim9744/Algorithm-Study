package Day04.제일작은수제거;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HJ {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	// 방법 1) (2.68ms, 53.4MB) - (22.48ms, 63.7MB)
	public static int[] solution(int[] arr) {
		int[] answer = {};

		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int item : arr)
			list.add(item);

		list.remove(list.indexOf(list.stream()
										.mapToInt(i -> i)
										.min()
										.getAsInt()));
		answer = list.stream().mapToInt(i -> i).toArray();

		return answer;
	}

//	// 방법 2) (0.02ms, 52.3MB) - (2.62ms, 66.7MB)
//	public static int[] solution(int[] arr) {
//		int[] answer = {};
//		int length = arr.length;
//		int min = 0;
//
//		// 비교 불가시 종료
//		if (length == 1) {
//			answer = new int[1];
//			answer[0] = -1;
//			return answer;
//		}
//
//		// 최소값 구하기
//		for (int i = 1; i < length; i++)
//			if (arr[i] < arr[min])
//				min = i;
//
//		// 배열 재생성
//		answer = new int[length - 1];
//		for (int i = 0, j = 0; i < length; i++)
//			if (i != min)
//				answer[j++] = arr[i];
//
//		return answer;
//	}
}
