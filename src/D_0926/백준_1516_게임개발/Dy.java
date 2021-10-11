package D_0926.백준_1516_게임개발;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Dy.class.getResourceAsStream("input.txt"));
		
		int N = Integer.parseInt(sc.nextLine());
		
		int[] times = new int[N];
		
		String[] board = new String[N];
		
		for(int i = 0; i<N; i++) {
			board[i] = sc.nextLine();
		}
		
		for(int i = 0; i<N; i++) {
			String[] temp = board[i].split(" ");
			int max = 0;
			for(int j = 1; j<temp.length - 1; j++) {
				if(times[Integer.parseInt(temp[j]) - 1] == 0) {
					times = solution(times, board, Integer.parseInt(temp[j]) - 1);
				};
				
				
				if(times[Integer.parseInt(temp[j]) - 1] > max) {
					max = times[Integer.parseInt(temp[j]) - 1];
				};
			}
			times[i] = Integer.parseInt(temp[0]) + max;
			System.out.println(times[i]);
		}

	}
	public static int[] solution(int[] times, String[] board, int num) {
		int[] answer = times;
		String[] temp = board[num].split(" ");
		int max = 0;
		for(int j = 1; j<temp.length - 1; j++) {
			if(times[Integer.parseInt(temp[j]) - 1] == 0) {
				answer = solution(times, board, Integer.parseInt(temp[j]) - 1);
			};
			
			
			if(times[Integer.parseInt(temp[j]) - 1] > max) {
				max = times[Integer.parseInt(temp[j]) - 1];
			};
		}
		times[num] = Integer.parseInt(temp[0]) + max;
		return answer;
		
	}

}
