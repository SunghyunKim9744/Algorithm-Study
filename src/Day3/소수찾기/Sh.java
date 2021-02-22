package Day3.소수찾기;

import java.util.HashSet;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30000;
		int answer = solution(n);
		System.out.println(answer);

	}

	public static int solution(int n) {
//	      Set<Integer> set = new HashSet<>();
//	      
//	      for(int i=0; i<n-1; i++)
//	          set.add(i+2);

		Set<Integer> compare = new HashSet<>();

		int evenCnt = 2;
		while (evenCnt * 2 <= n) {
			compare.add(evenCnt * 2);

			evenCnt++;

		}

		int thirdCnt = 3;
		while (thirdCnt * 3 <= n) {
			compare.add(thirdCnt * 3);
			thirdCnt += 2;

		}

		int fifCnt = 5;
		while (fifCnt * 5 <= n) {
			compare.add(fifCnt * 5);
			fifCnt += 2;
		}

		int sevenCnt = 7;
		while (sevenCnt * 7 <= n) {
			compare.add(sevenCnt * 7);
			sevenCnt += 2;
		}

		for (int i = 11; i * i <= n; i += 2) {
			if (compare.contains(i))
				continue;
			int j = i;
			while (i * j <= n) {
				if (compare.contains(i*j)) {
					j+=2;
					continue;
				}
				compare.add(i * j);
				j += 2;

			}

		}

		return n - 1 - compare.size();

	}
}
