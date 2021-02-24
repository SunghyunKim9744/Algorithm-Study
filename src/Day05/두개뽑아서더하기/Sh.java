package Day05.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		
		int[] numbers = {2,1,3,4,1};
		int[] answer = solution(numbers);

	}

	// 11:58~ 12:11
	// (2.71ms, 52.7MB) - > (7.31ms, 52.9MB)
	// 1. 컬렉션 이용
//	private static int[] solution(int[] numbers) {
//		int[] answer = {};
//		Set<Integer> set = new HashSet<>();
//		
//		for(int i=0; i<numbers.length-1; i++)
//			for(int j=i+1; j<numbers.length; j++)
//				set.add(numbers[i]+numbers[j]);
//		
//		List<Integer> list = new ArrayList<>(set);
//		
//		Collections.sort(list);
//		
//		answer = list.stream().mapToInt(i -> i).toArray();
//		return answer;
//	}
	
	// (5.73ms, 54.1MB) - > (15.16ms, 53.6MB)
	// 2. 스트림 이용
//	private static int[] solution(int[] numbers) {
//		int[] answer = {};
//		List<Integer> list = new ArrayList<>();
//		
//		for(int i=0; i<numbers.length-1; i++)
//			for(int j=i+1; j<numbers.length; j++)
//				list.add(numbers[i]+numbers[j]);
//		
//		
//		return list.stream().distinct().sorted().mapToInt(i->i).toArray();
//	}
	
	// (3.33ms, 54.4MB) - > (12.31ms, 53.2MB)
	// 3. 컬렉션 + 스트림
//	private static int[] solution(int[] numbers) {
//		int[] answer = {};
//		Set<Integer> set = new HashSet<>();
//		
//		for(int i=0; i<numbers.length-1; i++)
//			for(int j=i+1; j<numbers.length; j++)
//				set.add(numbers[i]+numbers[j]);
//		
//		return set.stream().sorted().mapToInt(i->i).toArray();
//	}
	
	
	// (0.02ms, 52.3MB) - > (28.84ms, 51.9MB)
	// 4. 직접 구현
	private static int[] solution(int[] numbers) {
		int[] answer = {};
		int answerLen = (numbers.length)*(numbers.length-1)/2;
		int[] answerTemp = new int[answerLen];
		int index = 0;
		
		// 데이터 넣기
		for(int i=0; i<numbers.length-1; i++)
			for(int j=i+1; j<numbers.length; j++)
				answerTemp[index++] = numbers[i]+numbers[j];
		
		// 데이터 정렬
		for(int i=0; i<answerTemp.length-1; i++)
			for(int j=i+1; j<answerTemp.length; j++) 
				if(answerTemp[i]>answerTemp[j]) {
					int temp = answerTemp[i];
					answerTemp[i] = answerTemp[j];
					answerTemp[j] = temp;
				}
		
		
		// 중복 제거
		int count = 1;
		for(int i=0; i<answerTemp.length-1; i++)
			if(answerTemp[i] != answerTemp[i+1])
				count++;
		
		answer = new int[count];
		int answerIndex = 1;
		answer[0] = answerTemp[0];
		for(int i=0; i<answerTemp.length-1; i++)
			if(answerTemp[i] != answerTemp[i+1])
				answer[answerIndex++] = answerTemp[i+1];
			
		
		return answer;
	}
	

}
