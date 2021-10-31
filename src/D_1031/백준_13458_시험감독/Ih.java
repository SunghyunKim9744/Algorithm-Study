package D_1031.백준_13458_시험감독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * 	https://www.acmicpc.net/problem/2115
 * 
 */
public class Ih {

	static int M, N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		char[][] map = new char[M][N];

		for (int i = 0; i < M; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = tmp.charAt(j);
			}
		}

		int ans = 0;
		ans += count_up(map);
		ans += count_down(map);
		ans += count_left(map);
		ans += count_right(map);

		System.out.println(ans);

	}

	// 위에다 걸려면
	// {'X', 'X'},
	// {'.', '.'}
	public static int count_up(char[][] map) {
		int cnt = 0;
		boolean[][] visit = new boolean[M][N];

		for (int r = 0; r < M - 1; r++) {
			for (int c = 0; c < N - 1; c++) {
				// 방문 안 했으면
				if (!visit[r][c]) {
					// 패턴이 일치하면
					if (map[r][c] == 'X' && map[r][c + 1] == 'X' && map[r + 1][c] == '.' && map[r + 1][c + 1] == '.') {
						cnt++;
						visit[r][c] = true;
						visit[r][c + 1] = true;
						visit[r + 1][c] = true;
						visit[r + 1][c + 1] = true;
					}
				}
			}
		}
		return cnt;
	}

	// 아래다 걸려면
	// {'.', '.'},
	// {'X', 'X'}
	public static int count_down(char[][] map) {
		int cnt = 0;
		boolean[][] visit = new boolean[M][N];

		for (int r = 0; r < M - 1; r++) {
			for (int c = 0; c < N - 1; c++) {
				// 방문 안 했으면
				if (!visit[r][c]) {
					// 패턴이 일치하면
					if (map[r][c] == '.' && map[r][c + 1] == '.' && map[r + 1][c] == 'X' && map[r + 1][c + 1] == 'X') {
						cnt++;
						visit[r][c] = true;
						visit[r][c + 1] = true;
						visit[r + 1][c] = true;
						visit[r + 1][c + 1] = true;
					}
				}
			}
		}
		return cnt;
	}

	// 좌측에다 걸려면
	// {'X', '.'},
	// {'X', '.'}
	public static int count_left(char[][] map) {
		int cnt = 0;
		boolean[][] visit = new boolean[M][N];

		for (int r = 0; r < M - 1; r++) {
			for (int c = 0; c < N - 1; c++) {
				// 방문 안 했으면
				if (!visit[r][c]) {
					// 패턴이 일치하면
					if (map[r][c] == 'X' && map[r][c + 1] == '.' && map[r + 1][c] == 'X' && map[r + 1][c + 1] == '.') {
						cnt++;
						visit[r][c] = true;
						visit[r][c + 1] = true;
						visit[r + 1][c] = true;
						visit[r + 1][c + 1] = true;
					}
				}
			}
		}
		return cnt;
	}

	// 우측에다 걸려면
	// {'.', 'X'},
	// {'.', 'X'}
	public static int count_right(char[][] map) {
		int cnt = 0;
		boolean[][] visit = new boolean[M][N];

		for (int r = 0; r < M - 1; r++) {
			for (int c = 0; c < N - 1; c++) {
				// 방문 안 했으면
				if (!visit[r][c]) {
					// 패턴이 일치하면
					if (map[r][c] == '.' && map[r][c + 1] == 'X' && map[r + 1][c] == '.' && map[r + 1][c + 1] == 'X') {
						cnt++;
						visit[r][c] = true;
						visit[r][c + 1] = true;
						visit[r + 1][c] = true;
						visit[r + 1][c + 1] = true;
					}
				}
			}
		}
		return cnt;
	}

}
