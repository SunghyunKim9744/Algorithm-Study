package Day2.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class HJ {
	
	public static void main(String[] args) {
		int[] arr = { 1, 4, 4, 4, 3, 3 , 0, 1, 1};
		System.out.println(solution(arr));
	}

	public static int[] solution(int[] arr) {
		int criteria = arr[0];

		List<Integer> list = new ArrayList<>();
		list.add(criteria);

		for (int i = 0; i < arr.length; i++)
			if (arr[i] != criteria) {
				criteria = arr[i];
				list.add(arr[i]);
			}
		
		return list.stream().mapToInt(i -> i).toArray();
	}
}
