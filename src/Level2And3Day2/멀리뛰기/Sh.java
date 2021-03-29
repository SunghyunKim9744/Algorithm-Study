package Level2And3Day2.멀리뛰기;

public class Sh {

	public static void main(String[] args) {
		int n1 =2000;
		int n2 = 3;
		
		System.out.println(solution(n1));

	}

	private static long solution(int n) {
		long answer = 0;
		int[] ans = new int[n+1];
		ans[1] = 1 % 1234567;
		if(n==1)
			return ans[1];
		ans[2] = 2 % 1234567;
		
		for(int i=3; i<=n; i++)
			ans[i] = (ans[i-1]+ans[i-2]) % 1234567;
		return ans[n];
		
	}

}
