package Level2Day02.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = solution(maps);
		System.out.println(answer);

	}

	private static int solution(int[][] maps) {
		
		int answer = 0;
		Queue<int[]> queue = new LinkedList<>();
		
		queue.add(new int[] {0,0});
		
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,1,-1};
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int x = temp[0];
			int y = temp[1];
			int currentVal = maps[x][y];
			
			for(int i=0; i<4; i++) {
				int nextX = x+dx[i];
				int nextY = y+dy[i];
				
				if(nextX < 0 || nextX >= maps.length || nextY < 0 || nextY >= maps[0].length || maps[nextX][nextY] == 0)
					continue;
				int nextVal = currentVal+1;
				if(maps[nextX][nextY] == 1) {
					queue.add(new int[] {nextX,nextY});
					maps[nextX][nextY] = nextVal;
				}
			}
		}
		
		int endX = maps.length-1;
		int endY = maps[0].length-1;
		
		if(maps[endX][endY] == 1)
			return -1;
		answer = maps[endX][endY];
		return answer;
	}

}
