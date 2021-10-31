package D_1031.백준_14501_퇴사;

import java.util.Scanner;

/*
 * 
 * 	https://www.acmicpc.net/problem/14501
 * 
 */
public class Db {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] T = new int[n+1];
		int[] P = new int[n+1];
		
		int[] d = new int[n+1];
		
		for(int i=0;i<n;i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int t = T[i];
			int p = P[i];
			
			if(i+t-1>=n) continue;
			for(int j=i+t;j<=n;j++) {
				d[j] = Math.max(d[j], d[i]+p);
			}
			
		}
		System.out.println(d[n]);
	}
}
