package Day06.삼진법뒤집기;

import java.util.ArrayList;
import java.util.List;

public class HJ {

	public static void main(String[] args) {
		int n = 125;
		System.out.println(solution(n));
	}

	// (0.05ms, 52.8MB) - (0.08ms, 51.7MB)
	public static int solution(int n) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		// 10진법 -> 3진법
		while (n > 0) {
			list.add(n % 3);
			n /= 3;
		}
		
		// 3진법 -> 10진법
		for (int i = 0; i < list.size(); i++)
			answer += list.get(i) * Math.pow(3, list.size() - i-1);

		return answer;
	}

}
