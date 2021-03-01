package 고득점Kit.완전탐색.소수찾기;

import java.util.HashSet;
import java.util.Set;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution("17") == 3);
		System.out.println(solution("011") == 2);
	}

	// 12:01 ~ 12:14
	//
	public static int solution(String numbers) {
		int answer = 0;

		String[] nums = numbers.split("");
		int n = nums.length;

		Set<Integer> set = new HashSet<>();

		for (String s : nums)
			set.add(Integer.parseInt(s));

//		for (int i = 0; i < n; i++)
//			for (int j = i; j < n; j++)
//				set.add(Integer.parseInt(nums[i] + nums[j]));
//
//		System.out.println(set.toString());

		return answer;
	}

}
