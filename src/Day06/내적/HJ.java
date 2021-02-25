package Day06.내적;

public class HJ {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { -3, -1, 0, 2 };
		System.out.println(solution(a, b));
	}

	// (0.02ms, 51.5MB) - (0.05ms, 52.9MB)
	public static int solution(int[] a, int[] b) {
		int answer = 0;

		for (int i = 0, len = a.length; i < len; i++)
			answer += a[i] * b[i];

		return answer;
	}
}
