package 고득점Kit.정렬.H_index;

import java.util.Arrays;

//4: 31 ~
public class Dy {

	public static void main(String[] args) {
		int[] citations = { 1,8,9,10,11,12};
		System.out.println(solution(citations));
	}

	public static int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		for(int i=0; i<citations.length; i++) {
			if(citations[citations.length-1-i] >= i+1 && citations.length - (i+1) <= 1+i) {
				answer = i+1;
			}
		}
		return answer;
	}

}
