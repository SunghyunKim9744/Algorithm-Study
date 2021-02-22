package Day3.이상한문자만들기;

public class HJ {
	public static void main(String[] args) {
		String s = "tRy hello world";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		String[] words = s.split(" ");

		for (int i=0; i < words.length; i++) {
			String[] charArr = words[i].split("");
			for (int j = 0; j < charArr.length; j++)
				if (j % 2 == 0)
					charArr[j] = charArr[j].toUpperCase();
			words[i] = String.join("",charArr);
		}

		answer = String.join(" ", words);
		return answer;
	}

}
