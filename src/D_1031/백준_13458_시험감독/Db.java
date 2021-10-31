package D_1031.백준_13458_시험감독;

import java.util.Scanner;

/*
 * 
 * 	https://www.acmicpc.net/problem/13458
 * 
 */
public class Db {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		
		int n = sc.nextInt();
		long[] people = new long[n];
		
		for(int i=0;i<n;i++) {
			people[i] = sc.nextLong();
		}
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		for(int i=0;i<n;i++) {
			long peo = people[i];
			if(peo>=b) peo-=b;
			else peo = 0;
			ans+=1;
			if(peo%c==0) ans+=peo/c;
			else ans+=(peo/c+1);
		}
		System.out.println(ans);
		
	}
}
