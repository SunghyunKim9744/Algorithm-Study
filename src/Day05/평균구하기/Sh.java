package Day05.평균구하기;

import java.util.Arrays;

public class Sh {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		double answer = solution(arr);
	}

	// (2.55ms, 52.7MB) - > (5.83ms, 53.1MB)
//	private static double solution(int[] arr) {
//		double answer = 0;
//		
//		return Arrays.stream(arr).average().getAsDouble();
//	}
	
	// (0.01ms, 52.9MB) - > (0.04ms, 52.9MB)
	private static double solution(int[] arr) {
		double answer = 0;
		double total = 0;
		int len = arr.length;
		
		for(int i=0; i<len; i++)
			total+=arr[i];
		answer = total/len;
		return answer;
	}
}
