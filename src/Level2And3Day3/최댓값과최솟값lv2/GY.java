package Level2And3Day3.최댓값과최솟값lv2;

import java.util.Arrays;

public class GY {

	public static void main(String[] args) {

		String s1 = "1 2 3 4", s2 = "-5 -1 -2 -3 -4", s3 = "-1 -1";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));

	}

	// 4 : 04 ~ 4 : 11
	// 10.63ms ~ 24.17ms
	public static String solution(String s) {
		String answer = "";

		String[] numsString = s.split(" ");
		
		int[] numsInt = new int[numsString.length];
		
		for (int i = 0; i < numsString.length; i++) 
			numsInt[i] = Integer.parseInt(numsString[i]);
		
		Arrays.sort(numsInt);
		
		answer = numsInt[0]+" "+numsInt[numsInt.length-1];

		return answer;
	}

}
