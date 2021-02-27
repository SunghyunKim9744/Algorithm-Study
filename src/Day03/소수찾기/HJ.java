package Day03.소수찾기;

import java.util.ArrayList;
import java.util.List;

public class HJ {
	public static void main(String[] args) {
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
		// 73, 79, 83, 89, 97
		int n = 100; // 1000000*1000000
		System.out.println(solution(n));
	}

//	// 방법 1) 시간 초과
//	public static int solution(int n) {
//		int answer = 0;
//
//		for (int i = 2; i <= n; i++) {
//			int criteria = 0;
//
//			for (int j = 1; j <= i; j++)
//				if (i % j == 0)
//					criteria++;
//
//			if (criteria == 2)
//				answer++;
//		}
//
//		return answer;
//	}

	public static int solution(int n) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 2, len = (int) Math.sqrt(n); i < len; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++)
				if (i % j == 0)
					count++;

			if (count == 2)
				list.add(i);
		}
		System.out.println(n);
		for (int i = 0, len = list.size(); i < len; i++) {
			n = n / list.get(i);
		}

		System.out.println(list);
		System.out.println(n);

		return answer;
	}

}
