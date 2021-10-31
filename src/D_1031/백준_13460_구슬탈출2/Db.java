package D_1031.백준_13460_구슬탈출2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 
 * 	https://www.acmicpc.net/problem/13460
 * 
 */
public class Db {
	
	public static int[] dx = {0,0,-1,1};
	public static int[] dy = {-1,1,0,0};
	
	public static char[][] map;
	public static int[][][][] d;
	public static int n,m;
	public static int rx,ry,bx,by,hx,hy;
	public static int ans=-1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new char[n][m];
		d = new int[n][m][n][m];

		for(int i=0;i<n;i++) {
			String s = br.readLine();
			for(int j=0;j<m;j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j]=='R') {
					rx = i;
					ry = j;
					map[i][j] ='.';
				}
				if(map[i][j]=='B') {
					bx = i;
					by = j;
					map[i][j]='.';
				}
				if(map[i][j]=='O') {
					hx=i;
					hy=j;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<n;k++) {
					for(int p=0;p<m;p++) {
						d[i][j][k][p] = -1;
					}
				}
			}
		}
		
		bfs();
		System.out.println(ans);
	}
	public static void bfs() {
	
		d[rx][ry][bx][by]=0;
		
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {rx,ry,bx,by});
		
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			int crx = tmp[0];
			int cry = tmp[1];
			int cbx = tmp[2];
			int cby = tmp[3];
			if(d[crx][cry][cbx][cby]>=10) return;
			for(int k=0;k<4;k++) {
				int[] red = move(crx,cry,dx[k],dy[k]);
				int nrx=red[0],nry=red[1],rcnt=red[2]; 
				int[] blue = move(cbx,cby,dx[k],dy[k]);
				int nbx=blue[0],nby=blue[1],bcnt=blue[2];
				
				if(map[nbx][nby]=='O') continue;
				if(map[nrx][nry]=='O') {
					ans = d[crx][cry][cbx][cby]+1;
					return;
				}
				if(nbx==nrx && nby==nry) {
					if(rcnt>bcnt) {
						nrx-=dx[k];
						nry-=dy[k];
					}
					else {
						nbx-=dx[k];
						nby-=dy[k];
					}
				}
				if(d[nrx][nry][nbx][nby]==-1) {
					d[nrx][nry][nbx][nby] = d[crx][cry][cbx][cby]+1;
					q.add(new int[] {nrx,nry,nbx,nby});
				}
			}
		}
	}
	public static int[] move(int x,int y,int dx,int dy) {
		int cnt=0;
		while(true) {
			if(map[x+dx][y+dy] == '#' || map[x][y]=='O') break;
			x += dx;
			y += dy;
			cnt++;
		}
		return new int[] {x,y,cnt};
	}
}
