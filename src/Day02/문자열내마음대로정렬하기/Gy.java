package Day02.문자열내마음대로정렬하기;

import java.util.Arrays;

public class Gy {

	public static void main(String[] args) {

		String[] strings1 = { "sun", "bed", "car" }, strings2 = { "abce", "abcd", "cdx" };
		int n1 = 1, n2 = 2;

		System.out.println(solution(strings1, n1));
		System.out.println(solution(strings2, n2));

	}

	public static String[] solution(String[] strings, int n) {

		Arrays.sort(strings, (st1, st2) -> {
			if (st1.charAt(n) != st2.charAt(n))
				return st1.charAt(n) - st2.charAt(n);
			else
				return st1.compareTo(st2);
		});

		return strings;
	}

}
