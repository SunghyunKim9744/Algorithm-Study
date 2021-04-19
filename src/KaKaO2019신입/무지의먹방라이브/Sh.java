package KaKaO2019신입.무지의먹방라이브;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		int[] food_times = {3,1,2};
		long k = 5;
		
		int answer = solution(food_times,k);

	}

	private static int solution(int[] food_times, long k) {
		int answer = 0;
		Set<Integer> set = new LinkedHashSet<>();
		Map<Integer,Integer> map = new LinkedHashMap<>();
		int cnt=1;
		for(int i : food_times)
			map.put(cnt++,i);
		Arrays.sort(food_times);
		for(int i : food_times)
			set.add(i);
		List<Integer> list = new ArrayList<>(set);
		
		int temp = 0;
		while(k != -1) {
			System.out.println("몇번");
			System.out.println(k);
			long min = (long)list.get(0)-temp;
			int len = map.size();
			if(min*len <= k) {
				k-=min*len;
				temp = list.get(0);
				list.remove(0);
				Iterator<Entry<Integer, Integer>>iter = map.entrySet().iterator();
				while (iter.hasNext()) {
					if(iter.next().getValue() == temp)
						iter.remove();
				}
				if(map.isEmpty())
					return -1;
			}
			else if(min*len >k) {
				System.out.println("hi");
				System.out.println(k);
				int turn = (int) (k%map.size());
				System.out.println(turn);
				
				int index = 0;
				System.out.println(map);
				for(Integer i : map.keySet()) {
					if(index == turn) {
						answer = i;
						k=-1;
						break;
					}
					index++;
					
						
				}
			}
			
		}
		System.out.println(answer);
		return answer;
	}

}
