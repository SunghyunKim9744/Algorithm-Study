package Day02.문자열다루기기본;

public class Gy {

	public static void main(String[] args) {

		System.out.println(solution("a234"));
		System.out.println(solution("1234"));

	}

	public static boolean solution(String s) {
		boolean answer = true;
		
		char[] chars = s.toCharArray();

		if (chars.length != 4 && chars.length != 6)
			return false;

		for (char c : chars)
			if (c < 48 || 57 < c)
				return false;

		return answer;
	}

}
