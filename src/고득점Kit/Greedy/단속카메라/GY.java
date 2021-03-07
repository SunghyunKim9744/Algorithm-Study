package 고득점Kit.Greedy.단속카메라;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GY {

	public static void main(String[] args) {
		int[][] routes = { { -20, 15 }, { -14, -5 }, { -5, -13 }, { -5, -3 } };

		System.out.println(solution(routes));

	}

	// 7:03 ~ 23
	private static int solution(int[][] routes) {
		int answer = 0;

		Map<Integer, Integer> route = new TreeMap<>();
		List<Map<Integer, Integer>> list = new ArrayList<>();
		for (int i = 0; i < routes.length; i++) {
			route.put(routes[i][0], routes[i][1]);
			System.out.println(route);
		}

		return answer;
	}

}
