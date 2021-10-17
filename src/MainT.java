import java.util.Scanner;

public class MainT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] omoks = new int[19][19];
		
		for(int y=0; y<19; y++) {
			for(int x=0; x<19; x++)
				omoks[y][x] = sc.nextInt();
		}
		
		// 동,남동,남,남서
		int[] dx = {1,1,0,-1};
		int[] dy = {0,1,1,1};
		int win = 0;
		int answerY = -1;
		int answerX = -1;
		label:
		for(int y=0; y<19; y++) {
			for(int x=0; x<19; x++) {
				int current = omoks[y][x];
				if(current == 0)
					continue;
				label2:
				for(int i=0; i<4; i++) {
					int nextX = x+dx[i]*4;
					int nextY = y+dy[i]*4;
					if(nextX < 0 || nextX >= 19 || nextY < 0 || nextY >= 19)
						continue;
					
					nextX = x;
					nextY = y;
					for(int j=0; j<4; j++) {
						nextX = nextX+dx[i];
						nextY = nextY+dy[i];
						if(omoks[nextY][nextX] != current)
							continue label2;
					}
					nextX = nextX+dx[i];
					nextY = nextY+dy[i];
					if(nextX < 0 || nextX >= 19 || nextY < 0 || nextY >= 19 || omoks[nextY][nextX] != current) {
						win = current;
						answerY = y+1;
						answerX = x+1;
						break label;
					}
				}
			}
				
		}
		
		System.out.println(win);
		if(win !=0)
			System.out.println(answerY+" "+answerX);
		
		
		
		
		
		
	}

}
