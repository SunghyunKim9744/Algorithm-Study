package Day2.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Gy {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}

	public static String solution(String s) {
		String answer = "";

		String[] strings = s.split("");
		Arrays.sort(strings, Collections.reverseOrder());
		for (String st : strings)
			answer += st;

		return answer;
	}

}
