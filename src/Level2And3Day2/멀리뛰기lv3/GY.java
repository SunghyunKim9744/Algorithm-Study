package Level2And3Day2.멀리뛰기lv3;

public class GY {

	public static void main(String[] args) {

		long n1 = 4;
		long n2 = 3;

		System.out.println(solution(n1));
		System.out.println(solution(n2));

	}

	// 구글링
	private static long solution(long n) {

		long answer = 0;

		long result1 = 1;
		long result2 = 2;

		if (n == 1)
			return result1;
		else if (n == 2)
			return result2;

		for (int i = 2; i < n; i++) {
			answer = result1 + result2;
			answer %= 1234567;
			result1 = result2;
			result2 = answer;
		}

		return answer;

	}

}
