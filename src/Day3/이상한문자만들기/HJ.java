package Day3.이상한문자만들기;

/*
 *  각 단어는 하나 이상의 공백문자로 구분
 */

public class HJ {
	public static void main(String[] args) {
		String s = "tRy hello      world    a";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		String[] words = s.split("\\s{1,}");

		for (int i = 0; i < words.length; i++) {
			char[] charArr = words[i].toCharArray();
			
			for (int j = 0; j < charArr.length; j++)
				if (j % 2 == 0)
					charArr[j] = Character.toUpperCase(charArr[j]);
				else
					charArr[j] = Character.toLowerCase(charArr[j]);
			
			words[i] = String.valueOf(charArr);
			System.out.println(words[i]);
		}
		
		answer = String.join(" ", words);
		return answer;
	}

}
