package D_0912.백준_1965_상자넣기;

import java.util.Scanner;

/*
 * 
 * 		https://www.acmicpc.net/problem/1965
 * 
 */

public class Sh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] ary = new int[N+1];
		for(int i=1; i<=N; i++)
			ary[i] = scan.nextInt();
		
		int[] dp = new int[N+1];
		
		int answer = 0;
		
		for(int i=1; i<=N; i++) {
			
			int max = 0;
			
			for(int j=0; j<i; j++) 
				if(ary[j] < ary[i]) 
					max = Math.max(max, dp[j]);
			
			dp[i] = max+1;
			answer = Math.max(answer, dp[i]);
		}
		
		System.out.println(answer);

	}

}
