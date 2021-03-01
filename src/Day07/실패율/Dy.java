package Day07.실패율;

import java.util.HashMap;
import java.util.Map;

public class Dy {
	/*
	 * 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
	 */

	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		System.out.println(solution(N, stages));
	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = {};
		answer = new int[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<stages.length; j++) {
				if(stages[j] == i) {
					map.put(i, map.getOrDefault(i, 0)+1);
					break;
				}
			}
		}

		// 실패율 내림차순
		return answer;
	}
}
