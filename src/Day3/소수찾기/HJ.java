package Day3.소수찾기;

import java.util.ArrayList;
import java.util.List;

public class HJ {
	public static void main(String[] args) {
		int n = 1000000;	// 1000000*1000000
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
		list.add(2);
		
		for(int i=3; i<=n; i++)
			if(i % 2 == 1)
				list.add(i);
		
		

		return answer;
	}
	
}
