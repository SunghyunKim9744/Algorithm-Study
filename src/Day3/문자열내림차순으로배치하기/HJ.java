package Day3.문자열내림차순으로배치하기;

public class HJ {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		char[] charArr = new char[s.length()];

		// 배열로 변경
		for (int i = 0; i < charArr.length; i++)
			charArr[i] = s.charAt(i);

		// 정렬
		for (int i = 0; i < charArr.length; i++)
			for (int j = 0; j < charArr.length - 1 - i; j++) {
				if (charArr[j] < charArr[j + 1]) {
					char temp = charArr[j];
					charArr[j] = charArr[j + 1];
					charArr[j + 1] = temp;
				}
			}

		answer = String.valueOf(charArr);
		return answer;
	}
}
