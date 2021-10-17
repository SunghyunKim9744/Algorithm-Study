package D_1011.백준_16953_AB;

import java.util.Scanner;

public class Db {
	public static int ans=-1;
	public static boolean isOk=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		dfs(n,m,1);
		
		System.out.println(ans);

	}
	public static void dfs(long n,long m,int cnt) {
		
		if(isOk) return;
		if(n>m) return;
		if(n==m) {
			ans = cnt;
			isOk = true;
			return;
		}
		
		dfs(n*2,m,cnt+1);
		dfs(n*10+1,m,cnt+1);
		
	}
	
	
}
