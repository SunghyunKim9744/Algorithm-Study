package KaKaO2021신입.메뉴리뉴얼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		
		int[] course = {2,3,4};
		
		String[] answer = solution(orders,course);

	}

	private static String[] solution(String[] orders, int[] course) {
		String[] answer = {};
		
		String[][] arr = new String[orders.length][];
		
		for(int i=0; i<orders.length; i++) {
			String[] temp = orders[i].split("");
			Arrays.sort(temp);
			arr[i] = temp;
		}
		
		Map<String,Integer> map = new HashMap<>();
		for(int r : course) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i].length < r)
					continue;
				String[] temp = new String[arr[i].length];
				int depth = 0;
				int start = 0;
				comb(arr[i],temp,start,depth,r,map);
			}
		}
		
		int[] max = new int[course.length];
		
		for(int i=0; i<course.length; i++) {
			int num = course[i];
			
			for(String key : map.keySet()) {
				if(key.length() == num && max[i] < map.get(key))
					max[i] = map.get(key);
			}
		}
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<max.length; i++) {
			int maxCnt = max[i];
			int num = course[i];
			if(maxCnt < 2)
				continue;
			for(String key : map.keySet()) {
				if(key.length() == num && map.get(key) == maxCnt)
					list.add(key);
			}
		}
		
		list.sort((s1,s2)->s1.compareTo(s2));
		answer = new String[list.size()];
		
		int index = 0;
		for(String s : list)
			answer[index++] = s;
		return answer;
	}

	private static void comb(String[] arr, String[] temp, int start, int depth, int r, Map<String, Integer> map) {
		if(depth == r) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<r; i++)
				sb.append(temp[i]);
			
			String key = sb.toString();
			map.put(key,map.getOrDefault(key,0)+1);
			return;
		}
		
		for(int i=start; i<arr.length; i++) {
			temp[depth] = arr[i];
			comb(arr,temp,i+1,depth+1,r,map);
		}
		
	}

}
