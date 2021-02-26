package Day06.신규아이디추천;

public class HJ {
	public static void main(String[] args) {
//		String newId = "...!@BaT#*..y.abcdefghijklm";
		String newId = "z-+.^.";
//		String newId = "=.=";
//		String newId = "123_.def";
//		String newId = "abcdefghijklmn.p";
		System.out.println(solution(newId));
	}

	public static String solution(String newId) {
		String answer = newId;

		answer = answer.toLowerCase();
		answer = answer.replaceAll("[^\\w-.]", "");
		answer = answer.replaceAll("[.]+", ".");
		answer = answer.replaceAll("(^[.]|[.]$)", "");
		answer = (answer.length() == 0) ? "a" : answer;
		answer = (answer.length() > 15) ? answer.substring(0, 15) : answer;
		answer = answer.replaceAll("[.]$", "");

		while (answer.length() < 3)
			answer += answer.substring(answer.length() - 1);

		return answer;
	}
}
