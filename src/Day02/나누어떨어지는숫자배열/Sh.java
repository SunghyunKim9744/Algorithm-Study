package Day02.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.List;

public class Sh {

public static void main(String[] args) {
		
		int[] arr = {5,9,7,10};
		int divisor = 5;
		int[] answer = solution(arr,divisor);
	}
	
	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        // 나누어떨어질때만 리스트에 추가
        for(int i=0; i<arr.length; i++)
            if(arr[i] % divisor == 0)
                list.add(arr[i]);
        
        // 아무것도 없을때 -1 리턴
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
            
        // 리스트에 담긴 원소 갯수만큼 배열 만들기
        answer = new int[list.size()];
        
        // 리스트의 원소를 배열에 담기
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        // 정렬(선택정렬)
        for(int i=0; i<answer.length-1; i++)
            for(int j=i+1; j<answer.length; j++){
                if(answer[i]>answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        return answer;
    }
}
