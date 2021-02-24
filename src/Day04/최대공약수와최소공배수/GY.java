package Day04.최대공약수와최소공배수;

import java.math.BigInteger;

public class GY {

	public static void main(String[] args) {
		solution(3, 12);
	}

	public static int[] solution(int n, int m) {
		// BigInteger활용 : 유클리드 호제법보다 느림
//		int[] answer = new int[2];
//
//		BigInteger n2 = BigInteger.valueOf(n);
//		BigInteger m2 = BigInteger.valueOf(m);
//		BigInteger gcd = n2.gcd(m2);
//		int lcm = n2.intValue() * m2.intValue() / gcd.intValue();
//
//		answer[0] = gcd.intValue();
//		answer[1] = lcm;
//
//		return answer;

		// ============================================================

		// 유클리드 호제법
		int[] answer = new int[2];

		if (n < m) { // 큰 수가 앞에 오도록 변경
			int temp = n;
			n = m;
			m = temp;
		}

		answer[0] = gcd(n, m);
		answer[1] = n * m / answer[0];

		return answer;
	}

	private static int gcd(int n, int m) {
		if (n % m == 0)
			return m;
		return gcd(m, n % m);
	}

}
