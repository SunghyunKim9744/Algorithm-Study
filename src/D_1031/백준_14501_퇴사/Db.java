package D_1031.백준_14501_퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 
 * 	https://www.acmicpc.net/problem/2115
 * 
 */
public class Db {
	public static int[] dx = { 0, 0, -1, 1 };
	public static int[] dy = { -1, 1, 0, 0 };
	public static boolean[][] visited;

	public static char[][] map;
	public static int n;
	public static int m;
	public static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new char[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = tmp.charAt(j);
			}
		}
		int ans = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == '.' && !visited[i][j]) {
					bfs(i, j);
				}
			}
		}

		for (int k = 0; k < 4; k++) {
			visited = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == 'O' && !visited[i][j]) {
						if(isRange(i+dx[k],j+dy[k]) &&map[i + dx[k]][j + dy[k]] == '.') {
							cnt=0;
							visited[i][j] = true;
							dfs(i, j, k);
							cnt++;
							ans += (cnt / 2);
						}
//						cnt = 0;
//						visited[i][j] = true;
//						dfs(i, j,k);
//						if(cnt>=2 && k==0) System.out.println(i+" "+j+" "+cnt);
					}
				}
			}
//			System.out.println(k+" "+ans);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println(ans);
	}

	public static void dfs(int sx, int sy, int dir) {
		for (int k = 0; k < 4; k++) {
			int nx = sx + dx[k];
			int ny = sy + dy[k];
			if (isRange(nx, ny) && map[nx][ny] == 'O') {
				if (!visited[nx][ny]) {
					if(isRange(nx+dx[dir],ny+dy[dir]) &&map[nx + dx[dir]][ny + dy[dir]] == '.') {
						cnt++;
						visited[nx][ny] = true;
						dfs(nx, ny, dir);					
					}
				}
			}
		}
	}


	public static void bfs(int sx, int sy) {

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { sx, sy });
		visited[sx][sy] = true;

		while (!q.isEmpty()) {

			int[] tmp = q.poll();
			int x = tmp[0];
			int y = tmp[1];

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (isRange(nx, ny) && map[nx][ny] == 'X') {
					map[nx][ny] = 'O';
				}
				if (isRange(nx, ny) && map[nx][ny] == '.') {
					if (!visited[nx][ny]) {
						visited[nx][ny] = true;
						q.add(new int[] { nx, ny });
					}
				}
			}
		}

	}

	public static boolean isRange(int nx, int ny) {
		if (nx < 0 || nx >= n || ny < 0 || ny >= m)
			return false;
		return true;
	}
}
