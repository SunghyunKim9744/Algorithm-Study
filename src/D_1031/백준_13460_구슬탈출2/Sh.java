package D_1031.백준_13460_구슬탈출2;

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

	static char[][] board;
	static int N, M;
	static int[] dy = { 0, 0, 1, -1 };
	static int[] dx = { 1, -1, 0, 0 };
	static int[] B;
	static int[] R;
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		answer = Integer.MAX_VALUE;
		board = new char[N][M];

		for (int i = 0; i < N; i++) {
			String strs = br.readLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = strs.charAt(j);
				if (board[i][j] == 'B')
					B = new int[] { i, j };
				else if (board[i][j] == 'R')
					R = new int[] { i, j };
			}
		}

		int cnt = 0;
		dfs(cnt);
		System.out.println(answer);
	}

	private static void dfs(int cnt) {
		if (cnt > 10)
			return;

		int[] cB = new int[] { B[0], B[1] };
		int[] cR = new int[] { R[0], R[1] };

		label: for (int i = 0; i < 4; i++) {
			if (sameLine(i)) {
				int[] firstBall = selectBall(i);
				int[] secondBall = firstBall == B ? R : B;

			}
		}

	}

	private static int[] selectBall(int i) {
		if (i == 0) {
			return R[1] > B[1] ? R : B;
		} else if (i == 1) {
			return R[1] > B[1] ? B : R;
		} else if (i == 2) {
			return R[0] > B[0] ? R : B;
		} else {
			return R[0] > B[0] ? B : R;
		}
	}

	private static boolean sameLine(int i) {
		if (i < 2) {
			return B[0] == R[0];
		} else {
			return B[1] == R[1];
		}
	}

}
