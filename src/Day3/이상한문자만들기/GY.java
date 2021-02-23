package Day3.이상한문자만들기;

public class GY {

	public static void main(String[] args) {
//		System.out.println(solution("try hello world"));
		System.out.println(solution(" try      HEllo  world  "));
	}

	public static String solution(String s) {
		String answer = "";
		// 띄어쓰기 기준으로 문장 분리
		String[] sentence = s.split(" ");

		for (int i = 0; i < sentence.length; i++) {
			char[] word = sentence[i].toCharArray();

			if (word.length != 0) {

				for (int j = 0; j < word.length; j++)
					answer += (j % 2 == 0) ? String.valueOf(word[j]).toUpperCase()
							: String.valueOf(word[j]).toLowerCase();
			}
			
			answer += " ";
		}

		answer = answer.substring(0, answer.length() - 1);

		return answer;

	}

}

//StringTokenizer stk = new StringTokenizer(s);
//
//while (stk.hasMoreTokens()) {
//	char[] word = stk.nextToken().toCharArray();
//	if (word.length != 0) {
//		for (int j = 0; j < word.length; j++)
//			answer += (j % 2 == 0) ? String.valueOf(word[j]).toUpperCase()
//					: String.valueOf(word[j]).toLowerCase();
//	}
//	if (stk.hasMoreTokens())
//		answer += " ";
//}