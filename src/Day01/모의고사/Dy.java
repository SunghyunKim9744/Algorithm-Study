package Day01.모의고사;

public class Dy {

	public int[] solution(int[] answers) {
		
		int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] points = {0, 0, 0};
        int[] members = {1, 2, 3};
        int winner = 0;
        
        for(int i = 0; i<answers.length; i++) {
        	if(answers[i] == first[i % first.length])
        		points[0]++;
        	if(answers[i] == second[i % second.length])
        		points[1]++;
        	if(answers[i] == third[i % third.length])
        		points[2]++;
        }
        
        for(int i=0; i<points.length-1; i++) {
        	int temp;
        	if(points[i] < points[i+1]) {
        		temp = points[i];
        		points[i] = points[i+1];
        		points[i+1] = temp;
        		temp = members[i];
        		members[i] = members[i+1];
        		members[i+1] = temp;
        	}
        		
        }
        
        for(int i=0; i<points.length; i++)
        	if(points[0] == points[i])
        		winner++;
        if(points[0] == 0 && points[1] == 0 && points[2] == 0)
            return answer;
        
        answer = new int[winner];
        for(int i=0; i<winner; i++)
        	answer[i] = members[i];
        
        for(int i=0; i<answer.length-1; i++) {
        	for(int j=0; j<answer.length-1-i; j++){
                int temp;
                if(answer[j] > answer[j+1]) {
                    temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }

        return answer;
    }

}
