package Day03.약수의합;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(12));
		System.out.println(solution(5));
		System.out.println(solution(0));
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
	}

	public static int solution(int n) {
		int answer = 0;

		if (n == 1)
			return 1;

		for (int i = 1; i * i <= n; i++)
			if (n % i == 0)
				if (i == (n / i))
					answer += i;
				else
					answer += i + (n / i);

		return answer;
	}

}
