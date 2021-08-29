package D_0829.백준_1725_히스토그램;

import java.util.Scanner;

/*
 * 
 * 		https://www.acmicpc.net/problem/1725
 * 
 */
public class Db {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			Math.max(ans, a[i]);
		}
		
		for(int i=2;i<=n;i++) {
			int tmp=0;
			for(int j=0;j+i<n;j++) {
				int min=-1;
				for(int k=j;k<=i;k++) {
					Math.min(min,a[k]);
				}
				tmp = i*min;
				Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}

}
