package Level2And3Day3.피보나치수lv2;

public class Sh {

	public static void main(String[] args) {

		int n1 = 3, n2 = 5;

		System.out.println(solution(n1));
		System.out.println(solution(n2));

	}

	// Top down
//	private static int solution(int n) {
//		int answer = 0;
//		
//		int[] fibo = new int[n+1];
//		
//		fibo[0] = 0 % 1234567;
//		fibo[1] = 1 % 1234567;
//		
//		for(int i=2; i<=n; i++)
//			fibo[i]= (fibo[i-1]+fibo[i-2]) % 1234567;
//		
//		answer = fibo[n];
//		return answer;
//	}
	
	// Bottom Up
	private static int solution(int n) {
		int answer = 0;
		
		int[] memo = new int[n+1];
		
		
		answer = fibo(memo,n);
		return answer;
	}

	private static int fibo(int[] memo, int n) {
		if(n<=0) 
			return 0;
		else if(n==1) 
			return memo[n] = 1;
		else if(memo[n] != 0)
			return memo[n];

		return memo[n]  = (fibo(memo,n-2)+fibo(memo,n-1)) % 1234567;
	}

}
