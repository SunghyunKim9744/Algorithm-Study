package Day02.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HJ {
	public static void main(String[] args) {
		int[] arr = { 2, 77, 1, 3, 35, 14 };
		int divisor = 1;

		System.out.println(solution(arr, divisor));
	}

	// 방법 3
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();

		// 숫자 구하기
		for (int element : arr)
			if (element % divisor == 0)
				list.add(element);

		if (list.size() == 0) {
			answer  = new int[-1];
			answer[0] = -1;
			return answer;
		}

//		// 정렬 : 버블
//		for (int i = 0; i < list.size() - 1; i++)
//			for (int j = 0; j < list.size() - i - 1; j++)
//				if (arr[j] > arr[j + 1]) {
//					int temp = list.get(j);
//					list.set(j, list.get(j + 1));
//					list.set(j + 1, temp);
//				}

		// 정렬 : 선택
		for (int i = 0; i < list.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(j) < list.get(min))
					min = j;
			
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
		
		// 배열로 변경
		answer = list.stream().mapToInt(i -> i).toArray();

		return answer;
	}

//	// 방법 2
//	public static int[] solution(int[] arr, int divisor) {
//		int[] answer = {};
//		List<Integer> list = new ArrayList<>();
//
//		// 정렬 : 버블
//		for (int i = 0; i < arr.length; i++)
//			for (int j = 0; j < arr.length - i - 1; j++)
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//
//		// 숫자 구하기
//		for (int element : arr)
//			if (element % divisor == 0)
//				list.add(element);
//
//		// 배열로 변경
//		answer = list.stream().mapToInt(i -> i).toArray();
//		if (answer.length == 0) {
//			answer = new int[1];
//			answer[0] = -1;
//		}
//
//		return answer;
//	}

//	// 방법 1
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
