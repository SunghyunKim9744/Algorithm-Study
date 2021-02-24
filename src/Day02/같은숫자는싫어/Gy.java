package Day02.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class Gy {

	public static void main(String[] args) {

		int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr2 = { 4, 4, 4, 3, 3 };

		solution(arr1);
		solution(arr2);

	}

	public static int[] solution(int[] arr) {

		int[] answer = {};

		List<Integer> list = new ArrayList<>();

		int num = arr[0];
		list.add(num);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				continue;
			else {
				num = arr[i];
				list.add(num);
			}
		}
		
		answer = new int[list.size()];
		
		for(int i =0;i<answer.length;i++)
			answer[i] = list.get(i);
		
		return answer;

	}

}
