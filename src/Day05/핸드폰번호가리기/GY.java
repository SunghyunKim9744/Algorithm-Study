package Day05.핸드폰번호가리기;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}

	public static String solution(String phone_number) {
		String answer = "";

		String[] nums = phone_number.split("");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < nums.length; i++)
			if (i <= nums.length - 5)
				sb.append("*");
			else
				sb.append(nums[i]);
		
		answer = sb.toString();

		return answer;
	}
}
