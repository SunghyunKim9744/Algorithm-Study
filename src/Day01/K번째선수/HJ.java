package Day01.K번째선수;

import java.util.Arrays;

public class HJ {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(solution(array, commands));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int answerLength = commands.length;
        int[] answer = new int[answerLength];

        for(int i =0; i < answerLength; i++) {
        	// 배열 추출
        	int[] item = commands[i];
        	int from = item[0] - 1;
        	int to = item[1];
        	int index = item[2] - 1;
        	
        	int[] temp = Arrays.copyOfRange(array, from, to);
        	
        	// 정렬
        	Arrays.sort(temp);
        	answer[i] = temp[index];
        }

        return answer;
    }

}
