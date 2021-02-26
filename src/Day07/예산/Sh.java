package Day07.예산;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {
		
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		int answer = solution(d,budget);

	}

	// 6:53 ~ 6:58
	// (0.39ms, 53MB) - > (1.46ms, 52.8MB)
	private static int solution(int[] d, int budget) {
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			if(d[i]<=budget) {
				budget -= d[i];
				answer++;
			}
			else
				break;
		}
		return 0;
	}

}
