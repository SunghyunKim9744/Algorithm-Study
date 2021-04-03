package etc.DevMatching;

import java.util.HashMap;
import java.util.Map;

public class ps1 {

	public static void main(String[] args) {
		int[] lottos1 = { 44, 1, 0, 0, 31, 25 }, lottos2 = { 0, 0, 0, 0, 0, 0 }, lottos3 = { 45, 4, 35, 20, 3, 9 },
				lottos4 = { 1, 0, 0, 0, 0, 0 };
		int[] win1 = { 31, 10, 45, 1, 6, 19 }, win2 = { 38, 19, 20, 40, 15, 25 }, win3 = { 20, 9, 3, 45, 4, 35 },
				win4 = { 1, 2, 3, 4, 5, 6 };

		solution(lottos1, win1);
		solution(lottos2, win2);
		solution(lottos3, win3);
		solution(lottos4, win4);

	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : win_nums)
			map.put(i, map.getOrDefault(i, 0) + 1);

		for (Integer i : lottos)
			map.put(i, map.getOrDefault(i, 0) - 1);

		int count = 7;

		for (Integer i : map.keySet())
			if (map.get(i) == 0)
				count--;

		if (count == 7)
			count = 6;

		answer[1] = count;

		int zero = 0;

		if (map.get(0) != null) {
			zero = map.get(0);
		}

		answer[0] = count + zero;
		if (answer[0] == 0)
			answer[0] = 1;

		return answer;
	}

}
