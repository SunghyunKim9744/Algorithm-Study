package D_1017.백준_18115_카드놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
 * 
 * 	https://www.acmicpc.net/problem/18115
 * 
 */
public class Sh {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] skills = new int[N];
		for(int i=0; i<N; i++)
			skills[i] = Integer.parseInt(st.nextToken());
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		int num = 1;
		for(int i=N-1; i>=0; i--) {
			int skill = skills[i];
			
			if(skill == 1) 
				deque.offerFirst(num);
			else if(skill == 2) {
				int temp = deque.pollFirst();
				deque.offerFirst(num);
				deque.offerFirst(temp);
			}
			else 
				deque.offerLast(num);
		
			num++;
		}
		
		StringBuilder sb = new StringBuilder();
		while(!deque.isEmpty())
			sb.append(deque.pollFirst()+" ");
		
		System.out.println(sb.toString());
		
	}

}
