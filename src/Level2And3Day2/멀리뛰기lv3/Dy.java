package Level2And3Day2.멀리뛰기lv3;

// 4:40 ~ 
public class Dy {

	public static void main(String[] args) {
		int n1 = 2000;
		int n2 = 3;
		
		solution(n2);
	}

//	private static long solution(int n) {
//		long answer = 0;
//		long one = (long) n;
//		long two = 0;
//		long sum = 0;
//		while(one >= 0) {
//			sum = one + two;
//			long temp = 1;
//			for(int i = 0; i<two; i++) {
//				temp = (temp * (sum-i) / (two - i));
//			}
//			answer = (answer + temp) % 1234567;
//			one -= 2;
//			two++;
//		}
//		return answer;
//	}
	
	private static long solution(int n) {
		long answer = 0;
		long[] nums = new long[n+1];
		if(n == 1)
			return 1;
		
		nums[1] = 1;
		nums[2] = 2;
		for(int i=3; i<n+1; i++) {
			nums[i] = (nums[i-1] + nums[i-2]) % 1234567;
		}
		answer = nums[n];
		return answer;
	}

}
