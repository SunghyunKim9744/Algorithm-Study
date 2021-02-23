package Day2.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gy {

	public static void main(String[] args) {

		int[] arr1 = { 5, 9, 7, 10 }, arr2 = { 2, 36, 1, 3 }, arr3 = { 3, 2, 6 };
		int d1 = 5, d2 = 1, d3 = 10;

		solution(arr1, d1);
		solution(arr2, d2);
		solution(arr3, d3);

	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		Arrays.sort(arr);
		List<Integer> list = new ArrayList<>();

		for (int i : arr)
			if (i % divisor == 0)
				list.add(i);

		if (list.size() == 0)
			list.add(-1);

		answer = list.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
