package D_1031.백준_14501_퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * 	https://www.acmicpc.net/problem/2115
 * 
 */
public class Sh {

	static int N;
	static int[] T, P;
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		T = new int[N];
		P = new int[N];
		answer = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}

		int start = 0;
		int total = 0;
		combination(start, total);
		System.out.println(answer);

	}

	private static void combination(int start, int total) {
		if (start >= N) {
			answer = Math.max(answer, total);
			return;
		}
		
		if(start+T[start] <= N)
			combination(start + T[start], total + P[start]);
		combination(start + 1, total);

	}
}
