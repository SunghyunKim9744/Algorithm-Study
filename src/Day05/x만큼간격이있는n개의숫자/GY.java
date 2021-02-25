package Day05.x만큼간격이있는n개의숫자;

public class GY {

	public static void main(String[] args) {
		solution(2, 5);
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];

		answer[0] = (long) x;
		for (int i = 1; i < n; i++)
			answer[i] = answer[i - 1] + x;

		return answer;
	}
}
