package Day4.제일작은수제거;

public class Dy {

	public int[] solution(int[] arr) {
        int[] answer = {};
        int lower = arr[0];
        int lowerIndex = 0;
        
        if(arr.length == 1) {
        	arr[0] = -1;
        	answer = arr;
        	return answer;
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] < lower) {
        		lower = arr[i];
        		lowerIndex = i;
        	}
        }
        answer = new int[arr.length-1];
        int answerIndex = 0;
        
        for(int i=0; i<arr.length; i++) {
        	if(i != lowerIndex) {
        		answer[answerIndex] = arr[i];
        		answerIndex++;
        	}
        }
        return answer;
    }
}
