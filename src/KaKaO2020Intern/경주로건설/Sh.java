package KaKaO2020Intern.경주로건설;

import java.util.LinkedList;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0,1,0,0},
							{0,1,1,1,0,1,0,0},
							{0,1,1,0,0,1,0,0},
							{0,1,1,0,1,1,0,0},
							{0,1,0,0,0,0,0,0},
							{0,1,0,1,1,1,1,1},
							{0,0,0,1,1,1,1,1},
							{1,1,1,1,1,1,1,1}
							};
		
		int answer = solution(board);

	}

	private static int solution(int[][] board) {
		int answer = 0;
		
		int N = board.length;
		int[] dx = {1,-1,0,0}; // 동 서
		int[] dy = {0,0,-1,1}; // 남 북
		
		Queue<Point> queue = new LinkedList<>();
		Point start = new Point(0,0,-1,0);
		queue.offer(start);
		while(!queue.isEmpty()) {
			// 현재 좌표의 정보
			Point current = queue.poll();
			int currentCost = current.cost;
			int currentX = current.x;
			int currentY = current.y;
			int currentDirection = current.direction;
			
			for(int i=0; i<4; i++) {
				int x = currentX+dx[i];
				int y = currentY+dy[i];
				int cost = 0;
				if( (x < 0) || (x >= N) || (y < 0) || (y >= N) || (board[x][y] == 1) )
					continue;
				
				if( (currentDirection == -1) || ( currentDirection == i)) 
					cost = currentCost + 100;
				else
					cost = currentCost + 600;
				
				if( (board[x][y] == 0) || board[x][y] >= cost ) {
					board[x][y] = cost;
					Point p = new Point(x,y,i,cost);
					queue.add(p);
				}
				
			}
		}
		
		
		return board[N-1][N-1];
	}

}

class Point{
	int x;
	int y;
	int direction;
	int cost;
	
	public Point(int x, int y, int direction, int cost) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.cost = cost;
	}
}
