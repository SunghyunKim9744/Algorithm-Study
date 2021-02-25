package Day05.x만큼간격이있는n개의숫자;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		int x = -10000000; // -10000000 ~ 10000000
		int n = 1000; // 1000
		System.out.println(Arrays.toString(solution(x, n)));
	}

	// (0.02ms, 51.8MB) - (0.05ms, 52.5MB)
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long xL = (long) x;

		while (n-- > 0)
			answer[n] = xL * (n + 1);

		return answer;
	}
	
}
