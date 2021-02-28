package Day07.다트게임;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int[] scores = new int[3];
		String[] splited = dartResult.split("(?=\\d{1,2})");

		System.out.println(Arrays.toString(splited));

		return answer;
	}
}
