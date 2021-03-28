package Level2And3Day1.가장긴팰린드롬lv3;

public class GY {

	public static void main(String[] args) {

		String s = "abacde", s2 = "abcdcba";
		System.out.println("answer : " + solution(s));
		System.out.println("answer : " + solution(s2));

	}

	//구글링
	private static int solution(String s) {
		int answer = 0;

		char[] character = s.toCharArray();

		for (int i = s.length(); i > 0; i--) {
			if (isPalindrom(s, i)) {
				answer = i;
				break;
			}
		}

		return answer;
	}

	private static boolean isPalindrom(String s, int len) {

		boolean result = true;

		for (int i = 0; i < s.length() - len; i++) {
			int left = i;
			int right = len - i + 1;
			for (int step = 0; step < len / 2; step++) {
				if (s.charAt(left++) != s.charAt(right--)) {
					result = false;
					break;
				}
			}
			if (result)
				break;
		}

		return result;

	}

}
