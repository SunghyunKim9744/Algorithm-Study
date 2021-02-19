package Day1.K번째선수;

import java.util.ArrayList;
import java.util.Arrays;

public class Gy {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		solution(array, commands);
		
	}

	public static int[] solution(int[] array, int[][] commands) {
		
		int[] answer = {};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < commands.length; i++) {

			int[] array2 = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(array2);

			list.add(array2[commands[i][2]-1]);

		}
		
		answer = new int[list.size()];
		for(int i = 0 ; i <list.size();i++) {
			answer[i] = list.get(i);
		}

		return answer;
		
	}
	
}
