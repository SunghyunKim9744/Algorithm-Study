package Level2And3Day3.피보나치수lv2;

public class GY {

	public static void main(String[] args) {

		int n1 = 3, n2 = 5;

		System.out.println(solution(n1));
		System.out.println(solution(n2));

	}

	// 4 : 30 ~ 4 : 34 -> 시간초과
//	public static int solution(int n) {
//		int answer = 0;
//
//		answer = fibonacci(n);
//
//		return answer;
//	}
//
//	private static int fibonacci(int n) {
//		int result = 0;
//
//		if (n == 0)
//			return 0;
//		else if (n == 1)
//			return 1;
//		else
//			result = fibonacci(n - 1) + fibonacci(n - 2);
//
//		return result;
//	}

	// ~ 4:38
	// 0.02ms ~ 3.42ms
	public static int solution(int n) {
		int answer = 0;

		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i < n; i++) {
			answer = num1 + num2;
			answer %= 1234567;
			num1 = num2;
			num2 = answer;
		}

//		answer %= 1234567; // 왜 여기 있으면 안되지?

		return answer;
	}

}
