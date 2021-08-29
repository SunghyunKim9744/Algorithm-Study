package D_0829.백준_14502_연구소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 
 * 		https://www.acmicpc.net/problem/14502
 * 
 */
public class Db {
	
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	
	static int[][] map;
	static int n,m;
	
	static int[][] d;
	static int ans=0;
	
	public static void bfs() {
		
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				d[i][j] = map[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(d[i][j]==2)
					bfs(i,j);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(d[i][j]==0) cnt++;
			}
		}
		ans =Math.max(cnt, ans);
	}
	public static void bfs(int sx,int sy) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {sx,sy});
		d[sx][sy]=3;
		
		while(!q.isEmpty()) {
			int[] xy = q.poll();
			int x = xy[0];
			int y = xy[1];
			
			for(int k=0;k<4;k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				
				if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
				if(d[nx][ny]!=0) continue;
				d[nx][ny] = 3;
				q.add(new int[]{nx,ny});
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		d = new int[n][m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<m;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]!=0) continue;
				for(int s=0;s<n;s++) {
					for(int k=0;k<m;k++) {
						if(map[s][k]!=0) continue;
						if(i==s && j==k) continue;
						for(int p=0;p<n;p++) {
							for(int q=0;q<m;q++) {
								if(map[p][q]!=0) continue;
								if(i==p && j==q) continue;
								if(s==p && k==q) continue;
								
								map[i][j]=1;
								map[s][k]=1;
								map[p][q]=1;
								bfs();
								map[i][j]=0;
								map[s][k]=0;
								map[p][q]=0;
								
							}
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}
	
}
