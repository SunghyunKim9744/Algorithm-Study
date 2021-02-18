package Day1.K번째선수;

import java.util.Arrays;

public class Sh {
	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		int[] answer = solution(array,commands);
		for(Integer ans : answer)
			System.out.println(ans);
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int tempLen = commands[i][1]- commands[i][0]+1;             
            int temp[] = new int[tempLen];
            System.arraycopy(array,commands[i][0]-1,temp,0,tempLen);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
