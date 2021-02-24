package Day02.문자열내마음대로정렬하기;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		String[] strings = { "sun", "bed", "car" };// { "abce", "abcd", "cdx" }//{ "sun", "bed", "car" }
		int n = 1;
		System.out.println(solution(strings, n));
	}

	public static String[] solution(String[] strings, int n) {
		
		// 정렬 및 Comparator 구현
		Arrays.sort(strings, (String str1, String str2) -> {
			if (str1.charAt(n) == str2.charAt(n))
				return str1.compareTo(str2);
			else
				return str1.charAt(n) - str2.charAt(n);
		});

		return strings;
	}

}
