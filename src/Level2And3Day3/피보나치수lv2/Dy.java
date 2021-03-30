package Level2And3Day3.피보나치수lv2;

public class Dy {

	public static void main(String[] args) {

		int n1 = 3, n2 = 5;

		System.out.println(solution(n1));
		System.out.println(solution(n2));

	}

	public static int solution(int n) {
		int answer = 0;
		int[] nums = new int[n+1];
		nums[0] = 0;
		nums[1] = 1;
		for(int i=2; i<n+1; i++) {
			nums[i] = (nums[i-1] + nums[i-2]) % 1234567;
		}
		answer = nums[n];
		return answer;
	}

}
