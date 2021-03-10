package 고득점Kit.정렬.H_index;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {
		int[] citations = { 0,0,0,1,1,1,1,1,1,1};
		int[] citations2 = {0,0,1,1,6,6,6,6,6,6};
		System.out.println(solution(citations));
		
	}

	// 8:11 ~
	// (0.49ms, 52.6MB) - > (2.34ms, 53MB)
	public static int solution(int[] citations) {
		int answer = 0;
		
		Arrays.sort(citations);
		
		int len = citations.length;
		int max = len;
		for(int i=max; i>=0; i--) {
			int index = -1;
			for(int j=0; j<len; j++) {
				if(citations[j]>=i) {
					index = j;
					break;
				}
			}
			
			if(index != -1) {
				int right = len-index;
				int left = index;
				if(left<=i && i<=right)
					return i;
			}
			
			
		}
		
		return 0;
		
			
		
	}

}
