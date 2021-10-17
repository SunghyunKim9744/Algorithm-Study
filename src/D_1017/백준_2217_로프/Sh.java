package D_1017.백준_2217_로프;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2217
 * 
 * 
 */
public class Sh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] ropes = new int[N];
		for(int i=0; i<N; i++)
			ropes[i] = scan.nextInt();
		
		Arrays.sort(ropes);
		
		int answer = 0;
		for(int i=0; i<N; i++) {
			int currentMaxWeight = ropes[i] * (N-i);
			answer = Math.max(answer, currentMaxWeight);
		}
		
		System.out.println(answer);
			
	}
}
