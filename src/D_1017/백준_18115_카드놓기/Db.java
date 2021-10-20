package D_1017.백준_18115_카드놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/*
 * 
 * 	https://www.acmicpc.net/problem/18115
 * 
 */
public class Db {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpComms = br.readLine().split(" ");
		
		Queue<Integer> cards = new LinkedList<>();
		Stack<Integer> commands = new Stack<>();
		
		Deque<Integer> initCards = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			cards.offer(i+1);
			commands.push(Integer.parseInt(tmpComms[i]));
		}
		
		for(int i=0;i<n;i++) {
			int cur = cards.poll();
			int command = commands.pop();
			// 1. 맨 위로
			if(command == 1) {
				initCards.add(cur);
			}
			// 2. 두번째로
			else if(command == 2) {
				int tmp = initCards.pollLast();
				initCards.offer(cur);
				initCards.offer(tmp);
			}
			// 3. 제일 밑으로
			else if(command == 3) {
				initCards.addFirst(cur);
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=n-1;i>=0;i--) {
			sb.append(initCards.pollLast()+" ");
		}
		System.out.println(sb.toString());
	}

}
