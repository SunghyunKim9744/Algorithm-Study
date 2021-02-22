package Day2.나누어떨어지는숫자배열;

public class Dy {

	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int answerSize = 0;
        int[] temp = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                temp[answerSize] = arr[i];
                answerSize++;
            }
        }
        
        for(int i=0; i<answerSize-1; i++){
            for(int j=0; j<answerSize-i-1; j++){
                if(temp[j] > temp[j+1]){
                    int temp2 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp2;
                }
            }
        }
        
        answer = new int[answerSize];
        
        for(int i=0; i<answerSize; i++)
            answer[i] = temp[i];
        
        if(answerSize == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}
