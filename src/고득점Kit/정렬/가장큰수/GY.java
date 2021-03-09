package 고득점Kit.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class GY {

	public static void main(String[] args) {
		int[] numbers1 = { 6, 10, 2, 11, 14 }, numbers2 = { 3, 30, 34, 5, 9 };

//		System.out.println(solution(numbers1));
		System.out.println(solution(numbers2));
	}

	// 3 : 05 ~ 3 : 28
	public static String solution(int[] numbers) {
		String answer = "";

		String[] number = new String[numbers.length];

		for (int i = 0; i < number.length; i++)
			number[i] = Integer.toString(numbers[i]);

		Arrays.sort(number, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}

		});

		StringBuilder sb = new StringBuilder();
		for (String s : number)
			sb.append(s);

		answer = sb.toString();

		// 질문하기 참고 : 0인 경우 0000 나올 수 있음
		if (answer.charAt(0) == '0')
			return "0";

		return answer;
	}

}

//===================================================
//3 : 05 ~ 3 :23
//틀린 풀이
//public static String solution(int[] numbers) {
//	String answer = "";
//
//	String[] numbers2 = new String[numbers.length];
//
//	for (int i = 0; i < numbers2.length; i++) {
//		numbers2[i] = Integer.toString(numbers[i]);
//	}
//
//	Arrays.sort(numbers2, new Comparator<String>() {
//
//		@Override
//		public int compare(String o1, String o2) {
//			return o1.charAt(0) - o2.charAt(0);
////			if(o1.charAt(0)<o2.charAt(0))
////				return -1;
////			return 1;
//		}
//
//	});
//
//	StringBuilder sb = new StringBuilder();
//	for (int i = numbers2.length - 1; i >= 0; i--)
//		sb.append(numbers2[i]);
//
//	answer = sb.toString();
//
//	return answer;
//}
//===================================================