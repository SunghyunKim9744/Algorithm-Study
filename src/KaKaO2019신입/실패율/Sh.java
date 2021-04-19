package KaKaO2019신입.실패율;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4, 4, 4, 4, 4};
		
		int[] answer = solution(N,stages);

	}

	private static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		
		int[] fails = new int[N+1];
		int[] totals = new int[N+1];
		
		for(int i : stages) {
			for(int j=1; j<=i; j++) {
				if(j > N)
					break;
				totals[j]++;
				if(j==i && i<=N)
					fails[j]++;	
			}	
		}
		System.out.println(fails[1]);
		Map<Integer,Double> map = new HashMap<>();
		
		for(int i=1; i<=N; i++) {
			int fail = fails[i];
			int total = totals[i];
			if(total == 0)
				map.put(i, 0.0);
			else {
				map.put(i, (double)fail/total);
			}
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		list.sort((i1,i2)->{
			double d1 = map.get(i1);
			double d2 = map.get(i2);
			if(d1 == d2) {
				return i1-i2;
			}
			else {
				int i = d2-d1 > 0 ? 1 : -1;
				return i;
			}
		});
		System.out.println(map);
		for(int i=0; i<N; i++) {
			answer[i] = list.get(i);
			
		}
			
		return answer;
	}

}
