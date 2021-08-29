package D_0829.백준_1725_히스토그램;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * 		https://www.acmicpc.net/problem/1725
 * 
 */
public class Sh {

	static class Node{
		int idx;
		int weight;
		public Node(int idx, int weight) {
			
			this.idx = idx;
			this.weight = weight;
		}
		
		
	}
	static int N;
	static int answer = 0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		Deque<Node> stack = new ArrayDeque<>();
		
		int mapSize = 0;
		for(int i=0; i<N; i++) {
			int num = scan.nextInt();
			list.add(num);
			int cnt = 0;
			while(!stack.isEmpty()) {
				if(stack.peekFirst().weight > num) {
					cnt++;
					Node n = stack.pollFirst();
					if(n.weight < num*(cnt+1))
						list.set(n.idx,num*(cnt+1));
				}
				else {
					
				}
			}
			
			mapSize++;
		}

	}

}
