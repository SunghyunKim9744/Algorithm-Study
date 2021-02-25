package Day05.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> numList = new ArrayList<Integer>();
        List<Integer> ansList = new ArrayList<Integer>();
        for(int i = 0; i<numbers.length; i++)
        	numList.add(numbers[i]);
        
        for(int i = 0; i<201; i++) {
        	for(int j= 0; j<i/2 + 1; j++) {
        		int num1 = numList.indexOf(j);
        		int num2 = numList.lastIndexOf(i-j);
        		if(num1 != -1 && num2 != -1 && num1 != num2) {
        			ansList.add(i);
        			break;
        		}
        	}
        }
        answer = new int[ansList.size()];
        
        for(int i=0; i<ansList.size(); i++) {
        	answer[i] = ansList.get(i);
        }

        return answer;
    }
    
}
