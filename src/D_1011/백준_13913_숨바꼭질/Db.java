package D_1011.백준_13913_숨바꼭질;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Db {
	public final static int MAX = 200001;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] dist = new int[MAX];
		int[] track = new int[MAX];
		
		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<>();

		for(int i=0;i<MAX;i++) {
			dist[i] = -1;
			track[i] = -1;
		}
		
		q.add(n);
		dist[n] = 0;
		
		while(!q.isEmpty()) {	
			int cur = q.poll();
			
			int next = cur-1;
			go(q,dist,track,cur,next);
			
			next = cur+1;
			go(q,dist,track,cur,next);
				
			next = cur*2;
			go(q,dist,track,cur,next);
		}
		
		System.out.println(dist[m]);
				
		trace(m,stack,track);
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	public static boolean isRange(int x) {
		if(x<0||x>=MAX) return false;
		return true;
	}
	public static void go(Queue<Integer> q,int[] dist,int[] track,int cur,int next) {
		if(isRange(next) && dist[next]==-1) {
			dist[next] = dist[cur]+1;
			track[next] = cur;
			q.add(next);
		}
	}
	public static void trace(int cur, Stack<Integer> stack, int[] track) {
		while(cur!=-1) {
			stack.add(cur);
			cur=track[cur];
		}
	}
}
