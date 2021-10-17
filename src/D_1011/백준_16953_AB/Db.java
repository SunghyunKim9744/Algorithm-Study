package D_1011.백준_16953_AB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Db {
	public static int ans=-1;
	public static boolean isOk=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		dfs(n,m,1);
		
		System.out.println(ans);

	}
	public static void dfs(int n,int m,int cnt) {
		
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
