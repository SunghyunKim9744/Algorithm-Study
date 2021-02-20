package Day2.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HJ {
	public static void main(String[] args) {
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 7;

		System.out.println(solution(arr, divisor));
	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();

		// 정렬 : 버블
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length -i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		// 숫자 구하기
		for (int element : arr) {
			if (element % divisor == 0)
				list.add(element);
		}

		// 배열로 변경
		answer = list.stream().mapToInt(i -> i).toArray();
		if (answer.length == 0) {
			answer = new int[1];
			Arrays.fill(answer, -1);
		}

		return answer;
	}

//	public static int[] solution(int[] arr, int divisor) {
//		int[] answer = {};
//		List<Integer> list = new ArrayList<>();
//		Arrays.sort(arr);
//		
//		// 숫자 구하기
//		for(int element : arr) {
//			if(element % divisor == 0)
//				list.add(element);
//		}
//		
//		// 배열로 변경
//		answer = list.stream().mapToInt(i -> i).toArray();
//		if(answer.length == 0) {
//			answer = new int[1];
//			Arrays.fill(answer, -1);
//		}
//
//		return answer;
//	}
}
