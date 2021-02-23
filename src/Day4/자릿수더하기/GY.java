package Day4.자릿수더하기;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}

	public static int solution(int n) {
		int answer = 0;
		
		String[] nums = Integer.toString(n).split("");
		for(String num : nums)
			answer += Integer.parseInt(num);
		
		return answer;
	}

}
