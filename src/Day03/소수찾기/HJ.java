package Day03.소수찾기;

import java.util.LinkedList;
import java.util.List;

public class HJ {
	public static void main(String[] args) {
		int n = 100; // 1000000*1000000

		long start = System.currentTimeMillis();
		System.out.println(solution(n));
		long end = System.currentTimeMillis();

		System.out.println(end);
		System.out.println(start);
		System.out.println("수행시간 : " + (end - start));
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

	//
	public static int solution(int n) {
		int answer = 0;
		List<Integer> prime = new LinkedList<>();

		for (int i = 2, len = (int) Math.sqrt(n); i <= len; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++)
				if (i % j == 0)
					count++;

			if (count == 2)
				prime.add(i);
		}
		
		return answer;
	}

}
