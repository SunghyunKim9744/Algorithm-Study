package Day02.같은숫자는싫어;

public class Dy {

	public int[] solution(int []arr) {
        int[] answer = {};
        int[] temp = new int[arr.length];
        int answerCnt = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                temp[answerCnt] = arr[i];
                answerCnt++; 
            }
            
            if(i+1 == arr.length -1){
                temp[answerCnt] = arr[i+1];
                answerCnt++; 
            }
                    
        }
        
        answer = new int[answerCnt];
        
        for(int i = 0; i<answerCnt; i++){
            answer[i] = temp[i];
        }
       
        return answer;
	}
}
