package Day3.약수의합;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {
		System.out.println(solution(12));
	}
	

	public static int solution(int n) {
		int answer = 0;
		int self = n;
		List<Integer> list = new ArrayList<Integer>();
		while(n>1) {
			for(int i = 2; i<n+1; i++) {
				if(n % i == 0) {
					list.add(i);
					n = n / i ;
					break;
				}
			}
		}
        
		List<Integer> ans = new ArrayList<Integer>();
		
		ans.add(1);
		ans.add(2);
		
		for(int i = 0; i<list.size()-1; i++) {
			if(list.get(i) != list.get(i+1)) {
				ans.add(list.get(i+1));
			}
		}
		
		List<Integer> multiple = new ArrayList<Integer>();
		
		for(int i = 0; i<list.size(); i++) {
			for(int j = i+1; j<list.size(); j++) {
				multiple.add(list.get(i)*list.get(j));
			}
		}
		
		multiple.sort(null);
		
		ans.add(multiple.get(0));
		
		for(int i = 0; i<multiple.size()-1; i++) {
			if(multiple.get(i) != multiple.get(i+1)) {
				ans.add(multiple.get(i+1));
			}
		}
		
		for(Integer key: ans)
			answer += key;
		
		answer += self;
		
        return answer;
    }
	
}
