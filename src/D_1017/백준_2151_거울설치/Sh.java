package D_1017.백준_2151_거울설치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2151
 * 
 */
public class Sh {

	static int N;
	static char[][] maps;
	static int[][][] distance;

	static class Mirror implements Comparable<Mirror> {
		int y, x, dir, cnt;

		public Mirror(int y, int x, int dir, int cnt) {
			this.y = y;
			this.x = x;
			this.dir = dir;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Mirror o) {
			return this.cnt - o.cnt;
		}

		@Override
		public String toString() {
			return "Mirror [y=" + y + ", x=" + x + ", dir=" + dir + ", cnt=" + cnt + "]";
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		maps = new char[N][N];
		distance = new int[N][N][4];
		boolean findStart = false;
		int[] start = null;
		int[] end = null;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				maps[i][j] = str.charAt(j);
				if (!findStart && maps[i][j] == '#') {
					start = new int[] { i, j };
					findStart = true;
				} else if (findStart && maps[i][j] == '#')
					end = new int[] { i, j };
				for(int k = 0; k<4; k++)
					distance[i][j][k] = Integer.MAX_VALUE; 
			}
		}

		
		int answer = bfs(start, end);
		System.out.println(answer);

	}

	private static int bfs(int[] start, int[] end) {

		int[] dx = { 1, -1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };
		Queue<Mirror> pq = new PriorityQueue<>();

		for (int i = 0; i < 4; i++) {
			pq.offer(new Mirror(start[0], start[1], i, 0));
			distance[start[0]][start[1]][i] = 0 ;
		}
	
		

		while (!pq.isEmpty()) {
			
			Mirror cur = pq.poll();
			int cY = cur.y;
			int cX = cur.x;
			int cD = cur.dir;
			int cC = cur.cnt;

			if (cY == end[0] && cX == end[1]) {
				return cC;
			}

			int nY = cY + dy[cD];
			int nX = cX + dx[cD];

			if (nY >= N || nY < 0 || nX >= N || nX < 0)
				continue;
			if (maps[nY][nX] == '*')
				continue;
			else if (maps[nY][nX] == '.') {
				if(cC < distance[nY][nX][cD]) {
					distance[nY][nX][cD] = cC;
					pq.offer(new Mirror(nY, nX, cD, cC));
				}
				
			}
			else {
				if(cC < distance[nY][nX][cD]) {
					distance[nY][nX][cD] = cC;
					pq.offer(new Mirror(nY, nX, cD, cC));
					if (cD < 2) {
						pq.offer(new Mirror(nY, nX, 2, cC + 1));
						pq.offer(new Mirror(nY, nX, 3, cC + 1));
					} else {
						pq.offer(new Mirror(nY, nX, 0, cC + 1));
						pq.offer(new Mirror(nY, nX, 1, cC + 1));
					}
				}
				
				
			}

		}

		return 0;
	}
}
