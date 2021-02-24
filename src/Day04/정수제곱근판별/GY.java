package Day04.정수제곱근판별;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}

	public static long solution(long n) {
		long sqrt = (long) Math.sqrt(n);
		if (Math.pow(sqrt, 2) == n)
			return (long) Math.pow(sqrt + 1, 2);
		else
			return -1;
	}
}
