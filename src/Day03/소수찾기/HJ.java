package Day03.소수찾기;

public class HJ {
	public static void main(String[] args) {
		int n = 1000000; // 1000000*1000000

		long start = System.currentTimeMillis();
		System.out.println(solution(n));
		long end = System.currentTimeMillis();

		System.out.println(end);
		System.out.println(start);
		System.out.println("수행시간 : " + (end - start));
	}

	public static int solution(int n) {
		int answer = 0;
		boolean numbers[] = new boolean[n + 1];
		numbers[0] = numbers[1] = true;

		// 소수 판단
		for (int i = 2, len = (int) Math.sqrt(n); i <= len; i++)
			if (!numbers[i])
				for (int j = i * i; j <= n; j += i)
					numbers[j] = true;

		// 소수 개수
		for (int i = 1; i <= n; i++)
			if (!numbers[i])
				answer++;

		return answer;
	}

}
