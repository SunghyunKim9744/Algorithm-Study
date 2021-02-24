package Day01.모의고사;

import java.util.ArrayList;
import java.util.List;

public class Sh {
	public static void main(String[] args) {

		int[] answers = {1,2,3,4,5};
		
		int[] answer = solution(answers);
        
        
        
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = null;
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
       int[] solves = {0,0,0};
        for(int i=0; i<answers.length; i++){
            if(answers[i] == first[i%5])
                solves[0]++;
            if(answers[i] == second[i%16])
                solves[1]++;
            if(answers[i] == third[i%20])
                solves[2]++;
        }
        
        int answerLen = 0;
        int max = solves[0];
        
        for(int i=0; i<solves.length-1; i++){
            if(solves[i+1]>max)
                max = solves[i+1];
        }
        
        List<Integer> answers2 = new ArrayList<>();
        for(int i=0; i<solves.length; i++){
            if(max == solves[i]){
                answerLen++;
                answers2.add(i+1);
            }
        }
        
        answer = new int[answerLen];
        
        for(int i=0; i<answer.length; i++)
            answer[i] = answers2.get(i);
        
        
        return answer;
    }
}
