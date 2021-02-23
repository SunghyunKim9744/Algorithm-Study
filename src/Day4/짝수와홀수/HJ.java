package Day4.짝수와홀수;

public class HJ {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}

	// (0.01ms, 53.8MB) - (0.02ms, 55.7MB)
	public static String solution(int num) {
		return (num % 2 == 0) ? "Even" : "Odd";
	}

}
