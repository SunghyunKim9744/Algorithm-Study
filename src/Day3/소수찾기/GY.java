package Day3.소수찾기;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
	}

	public static int solution(int n) {
		int answer = 0;

		boolean[] checked = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			if (!checked[i])
				for (int j = i * 2; j <= n; j = j + i)
					checked[j] = true;
		}
		
		for(int i = 2;i<=n;i++)
			if(!checked[i])
				answer++;

		return answer;
	}

}
