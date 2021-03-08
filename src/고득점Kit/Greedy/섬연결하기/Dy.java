package 고득점Kit.Greedy.섬연결하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// 3:07 ~
public class Dy {

	public static void main(String[] args) {

		int n = 4;
		int[][] costs = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };

		System.out.println(solution(n, costs));
	}

	private static int solution(int n, int[][] costs) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();
		
		for(int i=0; i<costs.length-1; i++) {
			map.put(costs[i][0], map.getOrDefault(costs[i][0], 0)+costs[i][2]);
			map.put(costs[i][1], map.getOrDefault(costs[i][1], 0)+costs[i][2]);
			data.put(costs[i][0], new ArrayList<Integer>());
			data.put(costs[i][0],);
		}
		
		List<Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(entryList, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(Entry<Integer, Integer> entry: entryList) {
			
		}
		

		return answer;
	}

}
