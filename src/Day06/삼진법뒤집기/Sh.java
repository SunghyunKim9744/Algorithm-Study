package Day06.삼진법뒤집기;

import java.util.ArrayList;
import java.util.List;

public class Sh {

	public static void main(String[] args) {
		int n = 45;
		
		int answer = solution(n);

	}

	// 7:32 ~ 7:40
	// (0.06ms, 52.9MB) - > (0.08ms, 52.3MB)
	private static int solution(int n) {
		int answer = 0;
		
		List<Integer> list = new ArrayList<>();
		while(n>0) {
			list.add(n%3);
			n/=3;
		}
		
		
		int len = list.size();
		for(Integer i : list) {
			answer += i*Math.pow(3,len-1);
			len--;
		}
			
		
		return answer;
	}

}
