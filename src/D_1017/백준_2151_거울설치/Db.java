package D_1017.백준_2151_거울설치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2151
 * 
 */
public class Db {

	public static int[] dx = { -1, 0, 1, 0 };
	public static int[] dy = { 0, 1, 0, -1 };

	public static char[][] map;
	public static boolean[][][] visited;
	public static int sx = -1, sy = -1, ex = -1, ey = -1;

	public static int n;
	public static boolean isOk;

	public static int ans=-1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		map = new char[n][n];

		int possible = 0;

		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = tmp.charAt(j);
				if (map[i][j] == '!')
					possible++;
				if (map[i][j] == '#') {
					if (sx == -1) {
						sx = i;
						sy = j;
					} else {
						ex = i;
						ey = j;
					}
				}
			}
		}
		for (int i = 0; i <= possible; i++) {
			for(int k=0;k<4;k++) {
				isOk = false;
				visited = new boolean[n][n][4];
				visited[sx][sy][k] = true;
				if(isRange(sx+dx[k],sy+dy[k]) && map[sx+dx[k]][sy+dy[k]]!='*') {
					dfs(sx, sy, i,k);
					if (isOk) {
						System.out.println(i);
						return;
					}				
					
				}
			}
		}
	}

	public static void dfs(int sx, int sy, int cnt, int k) {

		if (isOk)
			return;
		if (sx == ex && sy == ey) {
			isOk = true;
			return;
		}

		int nx = sx + dx[k];
		int ny = sy + dy[k];

		if (isRange(nx, ny) && map[nx][ny] != '*') {
			if (!visited[nx][ny][k]) {
				if (map[nx][ny] == '!') {
					if (cnt > 0) {
						if(k == 0) {
							dfs(nx, ny, cnt-1,1);
							dfs(nx, ny, cnt-1,3);							
						}
						if(k == 1) {
							dfs(nx, ny, cnt-1,0);
							dfs(nx, ny, cnt-1,2);							
						}
						if(k == 2) {
							dfs(nx, ny, cnt-1,1);
							dfs(nx, ny, cnt-1,3);							
						}
						if(k == 3) {
							dfs(nx, ny, cnt-1,0);
							dfs(nx, ny, cnt-1,2);							
						}
					}
				}
				dfs(nx, ny, cnt,k);
				visited[nx][ny][k] = false;
			}
		}

	}

	public static boolean isRange(int nx, int ny) {
		if (nx < 0 || nx >= n || ny < 0 || ny >= n)
			return false;
		return true;
	}
}
