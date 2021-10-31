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
public class Sh {

	static int M, N, answer;
	static char[][] gallerys;
	static boolean[][][] isChecked;
	static int[] mx = {1,0};
	static int[] my = {0,1};
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		answer = 0;
		gallerys = new char[M][N];
		// 동,서,남,북
		isChecked = new boolean[M][N][4];
		
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++)
				gallerys[i][j] = str.charAt(j);
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++)
				if(gallerys[i][j] == '.') {
					checkedPicture(i,j);
				}
		}
		
		System.out.println(answer);
		
	}

	private static void checkedPicture(int i, int j) {
		
		for(int m = 0; m<2; m++) {
			int nmy = i+my[m];
			int nmx = j+mx[m];
			
			if(nmy >= M || nmx >= N || gallerys[nmy][nmx] == 'X')
				continue;
			
			for(int d = 0; d < 4; d++) {
				int cy1 = i+dy[d];
				int cx1 = j+dx[d];
				int cy2 = nmy + dy[d];
				int cx2 = nmx+ dx[d];
				
				if(gallerys[cy1][cx1] == 'X' && gallerys[cy2][cx2] == 'X' && !isChecked[i][j][d] && !isChecked[nmy][nmx][d]) {
					isChecked[i][j][d] = true;
					isChecked[nmy][nmx][d] = true;
					answer++;
				}
			}
		}
		
	}
}
