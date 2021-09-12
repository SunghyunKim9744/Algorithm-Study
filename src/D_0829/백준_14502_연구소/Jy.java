package D_0829.백준_14502_연구소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * 		https://www.acmicpc.net/problem/14502
 * 
 */
public class Jy {
	static int N, M;
	static int[][] lab;
	static int safe;
	static int answer;
	static boolean[][] visited;
	static int[][] deltas = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
	
	static int spreadVirus(int y, int x, int count) {
		
		for(int[] delta : deltas) {
			int ny = y + delta[0];
			int nx = x + delta[1];
			
			if(0 <= ny && ny < N && 0 <= nx && nx < M && !visited[ny][nx] && lab[ny][nx] == 0) {
				visited[ny][nx] = true;
				count = spreadVirus(ny, nx, count + 1);
			}
		}
		return count;
	}
	
	static void setWall(int x, int y, int count) {
		// 벽을 3개 세웠을 경우
		if(count == 3) {
			// 현재 빈 칸의 수(처음 빈 칸에서 벽 3개를 뺌)
			int current = safe - 3;
			visited = new boolean[N][M];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(!visited[i][j] && lab[i][j] == 2) {
						visited[i][j] = true;
						// 퍼진 바이러스 수 만큼 빈 칸을 뺌
						current -= spreadVirus(i, j, 0);
					}
				}
			}
			answer = Math.max(answer, current);
			return;
		}
		for(int i = x; i < N; i++) {
			for(int j = y; j < M; j++ ) {
				if(lab[i][j] == 0) {
					lab[i][j] = 1;
					setWall(i, y + 1, count + 1);
					lab[i][j] = 0;
				}
			}
			y = 0;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		lab = new int[N][M];
		safe = 0;
		answer = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				lab[i][j] = Integer.parseInt(st.nextToken());
				// 처음 빈 칸의 수
				if(lab[i][j] == 0) {
					safe++;
				}
			}
		}
		
		setWall(0, 0, 0);
		System.out.println(answer);
	}

}
