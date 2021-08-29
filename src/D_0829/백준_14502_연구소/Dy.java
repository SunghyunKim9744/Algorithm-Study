package D_0829.백준_14502_연구소;
import java.util.*;
public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		
		int[][] board = new int[N][M];
		
		for(int i = 0; i<N; i++) {
			String[] temp2 = sc.nextLine().split(" ");
			for(int j = 0; j<M; j++) {
				board[i][j] = Integer.parseInt(temp2[j]);
			}
		}
		
		
			
		
		
	}

}
