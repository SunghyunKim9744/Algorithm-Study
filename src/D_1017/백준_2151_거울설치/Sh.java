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
	static int[] dx = {-1,1};
	static int[] dy = {1,1};
	static class Node implements Comparable<Node>{
		int y,x,dir,cnt;

		public Node(int y, int x, int dir, int cnt) {
			this.y = y;
			this.x = x;
			this.dir = dir;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Node o) {
			return this.cnt - o.cnt;
		}
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		maps = new char[N][N];
		
		boolean findStart = false;
		Node start = null;
		Node end = null;
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				maps[i][j] = str.charAt(j);
				if(!findStart && maps[i][j] == '#')
					start = new Node(i,j,-1,0);
				else if(findStart && maps[i][j] == '#')
					end = new Node(i,j,-1,0);
			}	
		}
		
		int answer = bfs(start,end);
		System.out.println(answer);
		
	}
	private static int bfs(Node start, Node end) {
		Queue<Node> pq = new PriorityQueue<>();
		pq.offer(start);
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			int y = cur.y;
			int x = cur.x;
			int dir = cur.dir;
			int cnt = cur.cnt;
			for(int i=0; i<2; i++) {
				int ny = y + dy[i];
				int nx = x + dx[i];
				
				if(ny >= N || ny < 0 || nx >= N || nx < 0)
					continue;
				if(maps[ny][nx] == '*')
					continue;
				
				if(maps[ny][nx] == '.')
					pq.offer(new Node(ny,nx,dir,cnt));
				else if(maps[ny][nx] == '!') {
					if(dir != i) {
						pq.offer(new Node(ny,nx,i,cnt+1));
					}
					else
						pq.offer(new Node(ny,nx,i,cnt));
				}
				
				if(maps[ny][nx] == '#')
					return cnt;
			}
			
		}
		return 0;
	}
}
