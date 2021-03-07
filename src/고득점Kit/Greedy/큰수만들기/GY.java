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

		String[] number2 = number.split("");
		int[] number3 = new int[number2.length];

		int maxNum = 0;
		int maxIndex = 0;
		for (int i = 0; i < number2.length; i++) {
			
			number3[i] = Integer.parseInt(number2[i]);
			
			if (maxNum < number3[i]) {
				maxNum = number3[i];
				maxIndex = i;
			}
			
		}

		System.out.println(maxNum);
		System.out.println(maxIndex);
		System.out.println(number);

		return answer;
		
	}

}