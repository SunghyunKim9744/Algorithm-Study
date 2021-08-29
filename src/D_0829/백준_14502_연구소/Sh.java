package D_0829.백준_14502_연구소;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 * 
 * 		https://www.acmicpc.net/problem/14502
 * 
 */
public class Sh {

	static class Cord{
		int y;
		int x;
		public Cord(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	static int N,M;
	static List<Cord> possible;
	static Cord[] tempWall = new Cord[3];
	static int[][] ary;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int answer = -1;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		ary = new int[N][M];
		possible = new ArrayList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				ary[i][j] = scan.nextInt();
				if(ary[i][j] == 0)
					possible.add(new Cord(i,j));
			}
		}
		
		int start = 0;
		int depth = 0;
		combination(start,depth);
		System.out.println(answer);

	}
	private static void combination(int start, int depth) {
		if(depth == 3) {
			int[][] temp = new int[N][M];
			for(int i=0; i<N; i++)
				temp[i] = Arrays.copyOf(ary[i], ary[i].length);
			
			for(Cord c : tempWall)
				temp[c.y][c.x] = 1;
			
			for(int i=0; i<N; i++)
				for(int j=0; j<M; j++) 
					if(temp[i][j] == 2)
						bfs(temp,new Cord(i,j));
		
			checkSize(temp);
			
			return;
		}
		
		for(int i=start; i<possible.size(); i++) {
			tempWall[depth] = possible.get(i);
			combination(i+1, depth+1);
		}
	}
	private static void checkSize(int[][] temp) {
		int total = 0;
		for(int i=0; i<N; i++)
			for(int j=0; j<M; j++)
				if(temp[i][j] == 0)
					total++;
		
		answer = Math.max(answer, total);
		
	}
	private static void bfs(int[][] temp,Cord cord) {
		
		Queue<Cord> queue = new LinkedList<>();
		queue.offer(cord);
		
		while(!queue.isEmpty()) {
			Cord current = queue.poll();
			
			int y = current.y;
			int x = current.x;
			for(int i=0; i<4; i++) {
				int nY = y+dy[i];
				int nX = x+dx[i];
				
				if(nX < 0 || nX >= M || nY < 0 || nY >=N || temp[nY][nX] != 0)
					continue;
				
				temp[nY][nX] = 2;
				queue.offer(new Cord(nY,nX));
			}
		}
		
	}

}
