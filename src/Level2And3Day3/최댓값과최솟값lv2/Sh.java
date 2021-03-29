package Level2And3Day3.최댓값과최솟값lv2;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {

		String s1 = "1 2 3 4", s2 = "-1 -2 -3 -4", s3 = "-1 -1";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));

	}

//	public static String solution(String s) {
//		String answer = "";
//
//		String[] strs = s.split(" ");
//		
//		int[] nums = new int[strs.length];
//		
//		int cnt = 0;
//		for(String str : strs)
//			nums[cnt++] = Integer.parseInt(str);
//		
//		Arrays.sort(nums);
//		
//		answer = nums[0] + " " + nums[nums.length-1];
//		return answer;
//	}
	
	public static String solution(String s) {
		String answer = "";

		String[] strs = s.split(" ");
		
		int[] nums = new int[strs.length];
		
		int cnt = 0;
		for(String str : strs)
			nums[cnt++] = Integer.parseInt(str);
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(max < nums[i])
				max = nums[i];
			
			if(min > nums[i])
				min = nums[i];
		}
		
		answer = min + " " +max;
		return answer;
	}

}
