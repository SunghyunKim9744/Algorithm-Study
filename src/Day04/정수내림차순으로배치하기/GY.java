package Day04.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(118372));
		;
	}

	public static long solution(long n) {
		// 런타임 에러
//		String[] num = Long.toString(n).split("");
//		Arrays.sort(num, Collections.reverseOrder());
//
//		StringBuilder sb = new StringBuilder();
//		for (String a : num)
//			sb.append(a);
//
//		return Integer.parseInt(sb.toString());

		long answer = 0;

		String[] num = Long.toString(n).split("");
		Arrays.sort(num, Collections.reverseOrder());
		for (int i = 0; i < num.length; i++)
			answer = answer * 10 + Integer.parseInt(num[i]);

		return answer;

	}
}
