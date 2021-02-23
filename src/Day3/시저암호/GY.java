package Day3.시저암호;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B   z", 4));
		System.out.println(solution("AaZz", 25));
	}

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (65 <= c && c <= 90)
				c = (char) (((c - 65) + n) % 26 + 65);
			else if (97 <= c && c <= 122)
				c = (char) (((c - 97) + n) % 26 + 97);
			answer += c;
		}

		return answer;
	}

}
