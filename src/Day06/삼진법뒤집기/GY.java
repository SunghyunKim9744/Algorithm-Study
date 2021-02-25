package Day06.삼진법뒤집기;

import java.util.LinkedList;
import java.util.List;

public class GY {

	public static void main(String[] args) {
		int n = 125;
		System.out.println(solution(n));
	}

	// 6:45 ~ 7:07 ==> 오류해결 못함
	public static int solution(int n) {
		int answer = 0;
		
		int criteria = 1;
		int square = 0;
		while (criteria <= n) {
			criteria *= 3;
			square++;
		}
		
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < square; i++) {
			for (int j = 2; j >= 0; j--) {
				if ((int) Math.pow(3, (square - 1 - i)) * j <= n) {
					list.add(j);
					n -= (int) Math.pow(3, (square - 1 - i)) * j;
					break;
				}
			}
		}

		for (int i = 0; i < list.size(); i++)
			answer += list.get(i) * Math.pow(3, i);

		return answer;
	}

}
