package D_1017.백준_2151_거울설치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2151
 * 
 */
public class Ih {

	public class info implements Comparable<info>{
		int r;
		int c;
		int dir;
		int cnt;
		
		info(int r, int c, int dir, int cnt){
			this.r = r;
			this.c = c;
			this.dir = dir;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(info o) {
			return cnt - o.cnt;
		}
	}
	
	public static PriorityQueue<info> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[M][N];
		
		for (int i = 0; i < M; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = tmp.charAt(j);
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == '#') {
					// 4방 탐색후 dir 1~4 중 하나 부여
					// 우선순위 큐에 추가
				}
			}
		}
		
		// 우선순위 큐 빌때까지 반복
		// 거울 설치 가능 위치 만날 때 마다 다 add 해줌
		// 방문 검사 확인 배열을 bool이 아닌 int로 확인
		// 
	}
}
