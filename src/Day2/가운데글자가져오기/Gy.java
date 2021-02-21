package Day2.가운데글자가져오기;

public class Gy {

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}

	public static String solution(String s) {
		String answer = "";

		String[] alphabet = s.split("");

		if (s.length() % 2 != 0) {
			answer = alphabet[s.length() / 2];
		} else {
			answer += alphabet[s.length() / 2 - 1] + alphabet[s.length() / 2];
		}

		return answer;

	}

}
