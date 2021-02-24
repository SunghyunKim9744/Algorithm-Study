package Day02.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class Sh {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		int[] answer = solution(arr);
	}
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        // 처음 인덱스 값 추가
        list.add(arr[0]);
        
        // 다음번이 이전꺼와 다를 때만 추가
        for(int i=0; i<arr.length-1; i++)
            if(arr[i] != arr[i+1])
                list.add(arr[i+1]);
        
        // 리스트의 원소 갯수만큼 배열 만들기
        answer = new int[list.size()];
        
        // 리스트의 원소를 배열에 담기
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        return answer;
    }
}
