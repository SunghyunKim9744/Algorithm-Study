package Day3.이상한문자만들기;

/*
 *  각 단어는 하나 이상의 공백문자로 구분
 */

public class HJ {
	public static void main(String[] args) {
		String s = "  tRy hello      world    a  ";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		char[] words = s.toCharArray();

		for (int i = 0, j = 0; i < words.length; i++) {
			if (words[i] == ' ') {
				j = 0;
				continue;
			}

			if (j++ % 2 == 0)
				words[i] = Character.toUpperCase(words[i]);
			else
				words[i] = Character.toLowerCase(words[i]);
		}

		return String.valueOf(words);
	}

}
