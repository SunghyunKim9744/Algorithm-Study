package D_1017.백준_2217_로프;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2217
 * 
 * 
 */
public class Db {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] lopes = new int[n];
		for(int i=0;i<n;i++) {
			lopes[i] = sc.nextInt();
		}
		Arrays.sort(lopes);
		int ans=0;
		for(int i=0;i<n;i++) {
			ans = Math.max(lopes[i]*(n-i),ans);
		}
		System.out.println(ans);
	}
}
