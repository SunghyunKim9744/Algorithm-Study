package Day4.제일작은수제거;

import java.util.LinkedList;
import java.util.List;

public class GY {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 1, 1, 1, 1 };
		int[] arr2 = { 10 };

		solution(arr1);
		solution(arr2);
	}

	public static int[] solution(int[] arr) {
		int[] answer = {};
		
		if(arr.length == 1)
			return new int[] {-1};
		
		int min = arr[0];
		for(int i : arr)
			if(i<min)
				min = i;
		
		List<Integer> list = new LinkedList<>();
		for(int i : arr)
			if(i != min)
				list.add(i);
		
		answer = list.stream().mapToInt(i->i).toArray();
		
		return answer;
		
		//=====================================================================

		// primitive타입 변경 불가
//		List<Integer> list = new LinkedList<Integer>(Arrays.asList(arr));
		// 한 줄로 만들기
//		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		List<Integer> list2 = IntStream.of(arr).boxed().collect(Collectors.toList());

//		// size가 1이면 바로 return
//		if (list.size() == 1)
//			return new int[] { -1 };
//		
//		// 내림차순 정렬
//		Collections.sort(list, Collections.reverseOrder());
//		// 마지막 인덱스 제거
//		list.remove(list.size() - 1);
//		// 배열로 변환
//		answer = list.stream().mapToInt(i -> i).toArray();

		
		//=====================================================================
//		List<Integer> list = new LinkedList<>();
//		int min = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] <= min)
//				min = arr[i];
//			list.add(arr[i]);
//		}
//		
//		if (list.size() == 1)
//			return new int[] { -1 };
//
//		Collections.sort(list, Collections.reverseOrder());
//		for (int i = list.size() - 1; i >= 0; i--) {
//			if (list.get(i) == min)
//				list.remove(i);
//		}
//
//		answer = list.stream().mapToInt(i -> i).toArray();
//
//		return answer;
		
		//======================================================================
		
		
		
	}

}
