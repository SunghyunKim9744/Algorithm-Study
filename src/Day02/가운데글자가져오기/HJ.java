package Day02.가운데글자가져오기;

public class HJ {
	public static void main(String[] args) {
		String s = "abcde";// qwer//abcde
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		int length = s.length();
		String answer = (length % 2 == 0) ?
						s.substring(length / 2 - 1, length / 2 + 1)
						: s.substring(length / 2, length / 2 + 1);

		return answer;
	}
}
