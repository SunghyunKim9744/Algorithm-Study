package D_0912.백준_1965_상자넣기;

import java.util.Scanner;

/*
 * 
 * 		https://www.acmicpc.net/problem/1965
 * 
 */

public class Db {

static int[] d;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] d = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			d[i] = 1;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[j]<arr[i]) {
					d[i]=Math.max(d	[i], d[j]+1);
				}
			}
		}
		int ans = -1;
		for(int i=0;i<n;i++) {
			ans = Math.max(ans, d[i]);
		}
		System.out.println(ans);
	}

}
