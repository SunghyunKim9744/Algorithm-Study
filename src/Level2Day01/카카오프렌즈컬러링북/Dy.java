package Level2Day01.카카오프렌즈컬러링북;

public class Dy {

	public static void main(String[] args) {
		int m = 13;
		int n = 16;
		int[][] p  = {{0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},{0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},{0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},{0,1,1,1,1,2,1,1,1,1,2,1,1,1,1,0},{0,1,1,1,2,1,2,1,1,2,1,2,1,1,1,0},{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},{0,1,3,3,3,1,1,1,1,1,1,3,3,3,1,0},{0,1,1,1,1,1,2,1,1,2,1,1,1,1,1,0},{0,0,1,1,1,1,1,2,2,1,1,1,1,1,0,0},{0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}};
//		{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		solution(m,n,p);

	}

	private static int[] solution(int m, int n, int[][] picture) {

        int[] answer = new int[2];
        int[][] pic = new int[m][n];
        
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		pic[i][j] = picture[i][j];
        	}
        }
        
        while(true) {
	        int x = 0;
	        int y = 0;
	        int pixel = 0;
	        
	        for(int i=0; i<m; i++) {
	        	for(int j=0; j<n; j++) {
	        		if(pic[i][j] != 0) {
	        			pixel = pic[i][j];
	        			x = i;
	        			y = j;
	        		}
	        	}
	        }
	        
	        if(pixel == 0) {
	        	break;
	        }
	        
	        int temp = dfs(m, n, x, y, pic, pixel);
	        if(temp > answer[1]) {
	        	answer[1] = temp;
	        }
	        answer[0]++;
        }
        return answer;
		
	}

	private static int dfs(int m, int n, int x, int y, int[][] p, int pixel) {
		int answer = 0;
		
		
		if(p[x][y] == pixel) {
			answer++;
			p[x][y] = 0;
		
			if(x+1<m) {
				answer += dfs(m, n, x+1, y, p, pixel);
			}
			if(x>0) {
				answer += dfs(m, n, x-1, y, p, pixel);
			}
			if(y+1<n) {
				answer += dfs(m, n, x, y+1, p, pixel);
			}
			if(y>0) {
				answer += dfs(m, n, x, y-1, p, pixel);
			}
		}
		
		return answer;
		
	}

}
