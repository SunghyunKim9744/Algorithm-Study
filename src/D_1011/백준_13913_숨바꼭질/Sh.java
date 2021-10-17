package D_1011.백준_13913_숨바꼭질;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sh {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int[] parent = new int[100001];
		for(int i=0; i<parent.length; i++)
			parent[i] = -1;
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(N);
		parent[N] = N;
		int answer = 0;
		label:
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for(int i=0; i<size; i++) {
				int cur = queue.poll();
				if(cur == K)
					break label;
				int next1 = cur+1;
				if(next1 <= K && parent[next1] == -1) {
					parent[next1] = cur;
					queue.offer(next1);
				}
				
				int next2 = cur-1;
				if(next2 >= 0 && parent[next2] == -1) {
					parent[next2] = cur;
					queue.offer(next2);
				}
				
				int next3 = cur*2;
				if(next3 <= 100000 && parent[next3] == -1) {
					parent[next3] = cur;
					queue.offer(next3);
				}
			}
			
			answer++;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(K+" ");
		int temp = K;
		
		while(parent[temp] != temp) {
			sb.append(parent[temp]+" ");
			temp = parent[temp];
		}
		
		System.out.println(answer);
		String[] strs = sb.toString().split(" ");
		sb= new StringBuilder();
		for(int i=strs.length-1; i>=0; i--)
			sb.append(strs[i]+" ");
		System.out.println(sb.toString());
		
		
		
		

	}

}
