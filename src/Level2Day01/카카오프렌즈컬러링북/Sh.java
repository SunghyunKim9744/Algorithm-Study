package Level2Day01.카카오프렌즈컬러링북;

import java.util.LinkedList;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
		int[] answer = solution(m,n,picture);

	}

	private static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
		boolean[][] visited = new boolean[m][n];
		for(int x=0; x<m; x++) {
			for(int y=0; y<n; y++) {
				if( (picture[x][y] !=0) && (!visited[x][y]) ) {
					numberOfArea++;
					int cnt = bfs(picture,x,y,visited);
					maxSizeOfOneArea = Math.max(cnt, maxSizeOfOneArea);
				}
			}
		}
		
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
        return answer;
	}

	private static int bfs(int[][] picture, int x, int y, boolean[][] visited) {
		
		int[] dx = {1,-1,0,0}; // 동 서
		int[] dy = {0,0,-1,1}; // 남 북
		
		Queue<int[]> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.add(new int[] {x,y});
		int cnt = 1;
		
		int m = picture.length;
		int n = picture[0].length;
		
		int value = picture[x][y];
		while(!queue.isEmpty()) {
			
			int[] temp = queue.poll();
			x = temp[0];
			y = temp[1];
			
			for(int i=0; i<4; i++) {
				int nextX = x+dx[i];
				int nextY = y+dy[i];
				if(nextX < 0 || nextX >= m || nextY < 0 || nextY >= n || visited[nextX][nextY] || picture[nextX][nextY] != value)
					continue;
				cnt++;
				queue.add(new int[] {nextX,nextY});
				visited[nextX][nextY] = true;
			}
		}
		return cnt;
	}

}
