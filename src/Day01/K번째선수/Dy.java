package Day01.K번째선수;

public class Dy {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int length = commands[i][1]-commands[i][0]+1;
            int[] temp = new int[length];
            for(int j=0; j<length; j++){
                temp[j] = array[j+commands[i][0]-1];
            }
            
            for(int j=0; j<temp.length-1; j++){
                for(int k=0; k<temp.length-1-j; k++){
                    int temp2 = 0;
                    if(temp[k] > temp[k+1]){
                        temp2 = temp[k+1];
                        temp[k+1] = temp[k];
                        temp[k] = temp2;
                    }
                }
            }
            
            
            answer[i] = temp[commands[i][2]-1];
        }
            
        
        return answer;
    }

}
