package D_1031.백준_13458_시험감독;

import java.io.IOException;
import java.util.Scanner;

/*
 * 
 * 	https://www.acmicpc.net/problem/2115
 * 
 */
public class Sh {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = scan.nextInt();

		int B = scan.nextInt();
		int C = scan.nextInt();

		double answer = 0;

		for (int i = 0; i < N; i++) {
			answer += 1;
			if (A[i] - B > 0)
				answer += (Math.ceil((A[i] - B) / (double) C));
		}

		System.out.println(String.format("%.0f", answer));
	}

}
