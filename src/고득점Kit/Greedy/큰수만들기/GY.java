package 고득점Kit.Greedy.큰수만들기;

public class GY {

	public static void main(String[] args) {
		String number1 = "1924", number2 = "1231234", number3 = "4177252841";

		int k1 = 2, k2 = 3, k3 = 4;

		System.out.println(solution(number1, k1));
		System.out.println(solution(number2, k2));
		System.out.println(solution(number3, k3));
	}

	// 9:47 ~ 9:54 풀이방법 생각 안남
	// 9:51 ~
	private static String solution(String number, int k) {

		String answer = "";

		StringBuilder sb = new StringBuilder();

		int index = 0;

		for (int i = 0; i < number.length() - k; i++) {
			char max = '0';

			for (int j = index; j <= i + k; j++) {
				if (max < number.charAt(j)) {
					max = number.charAt(j);
					index = j + 1;
				}
			}

			sb.append(max);
			System.out.println(index);
		}

		answer = sb.toString();
		
		return answer;

	}

}