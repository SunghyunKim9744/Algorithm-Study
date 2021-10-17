package D_1011.백준_16953_AB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		long B = scan.nextLong();
		
		int answer = -1;
		Queue<Long> queue = new LinkedList<>();
		queue.offer(A);
		int depth = 1;
		label:
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0; i<size; i++) {
				long num = queue.poll();
				
				long func1 = num*2;
				long func2 = num*10 + 1;
				
				if(func1 == B || func2 == B) {
					answer = depth+1;
					break label;
				}
				if(func1 < B)
					queue.offer(func1);
				if(func2 < B)
					queue.offer(func2);
			}
			
			depth++;
		}
		
		System.out.println(answer);

	}

}
