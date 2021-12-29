package D_1229.메뉴리뉴얼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sh {

	static char[][] menus;
	static Map<String,Integer> map;
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		
		String[] answer = solution(orders, course);

	}

	private static String[] solution(String[] orders, int[] course) {
		String[] answer = {};
		int peopleCnt = orders.length;
		 menus = new char[peopleCnt][];
		int peopleIdx = 0;
		for(String order : orders) {
			char[] menu = order.toCharArray();
			Arrays.sort(menu);
			menus[peopleIdx++] = menu;
		}
		map = new HashMap<>();
		
		for(int cours : course) {
			for(int i=0; i<menus.length; i++) {
				if(menus[i].length >= cours) {
					int start = 0;
					int depth = 0;
					int cnt = cours;
					int people = i;
					char[] temp = new char[cours];
					combination(start,temp,depth,cnt,people);
				}
			}
		}
		
		int[][] coursMaxCnt = new int[course.length][1];
		int cousreIdx = 0;
		for(int cours : course) {
			int max = -1;
			for(String key : map.keySet()) {
				if(key.length() != cours)
					continue;
				else {
					if(map.get(key) >= 2 && map.get(key) > max) {
						max = map.get(key);
						coursMaxCnt[cousreIdx][0] = max;
					}
				}
			}
			cousreIdx++;
		}
		List<String> answerList = new ArrayList<>();
		for(int i=0; i<coursMaxCnt.length; i++) {
			int value = coursMaxCnt[i][0];
			for(String key : map.keySet()) {
				if(key.length() == course[i] && map.get(key) == value)
					answerList.add(key);
			}
		}
		
		Collections.sort(answerList);
		answer = new String[answerList.size()];
		int answerIdx = 0;
		for(String s : answerList) {
			answer[answerIdx++] = s;
		}
		
		return answer;
	}

	private static void combination(int start, char[] temp,int depth, int cnt, int people) {
		if(depth == cnt) {
			String key = String.valueOf(temp);
			map.put(key, map.getOrDefault(key, 0)+1);
			return;
		}
		
		for(int i=start; i<menus[people].length; i++) {
			temp[depth] = menus[people][i];
			combination(i+1, temp, depth+1, cnt, people);
		}
		
	}

}
