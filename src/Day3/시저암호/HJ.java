package Day3.시저암호;

public class HJ {
	public static void main(String[] args) {
		String s = "a B z"; // A, Z, a, z
		int n = 4;
		System.out.println(solution(s, n));
	}

	public static String solution(String s, int n) {
		char[] charArr = s.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			if ('A' <= (int) charArr[i] && (int) charArr[i] <= 'Z')
				charArr[i] = charArr[i] + n > 'Z' ?
							(char) (('A' - 1) + (n - ('Z' - charArr[i])))
							: (char) (charArr[i] + n);
			else if ('a' <= (int) charArr[i] && (int) charArr[i] <= 'z')
				charArr[i] = charArr[i] + n > 'z' ?
							(char) (('a' - 1) + (n - ('z' - charArr[i])))
							: (char) (charArr[i] + n);
		}

		return String.valueOf(charArr);
	}

}
