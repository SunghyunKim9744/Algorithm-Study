package Day04.최대공약수와최소공배수;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		int n = 1000000;
		int m = 1000000;
		System.out.println(Arrays.toString(solution(n, m)));
	}

	// (0.02ms, 53MB) - (0.05ms, 53MB)
	public static int[] solution(int n, int m) {
		int[] answer = { 1, 1 };
		int divisor = 2;

		while (!(n == 1 && m == 1) && (n < m ? divisor <= n : divisor <= m)) {
			if (n % divisor == 0 && m % divisor == 0) {
				n /= divisor;
				m /= divisor;
				answer[0] *= divisor;
				divisor = 2;
			} else
				divisor++;
		}
		
		answer[1] = answer[0] * n * m;

		return answer;
	}

}
