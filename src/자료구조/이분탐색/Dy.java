package 자료구조.이분탐색;

import java.util.Arrays;

public class Dy {

	public static void main(String[] args) {
		int[] arr = { 3, 10, 15, 19, 22, 26, 27, 35, 40, 50 };

		int value = 28;
		System.out.println(solution(arr,value));
	}

	private static int solution(int[] arr, int value) {
		int answer = 0;
		int min = 0;
		int max = arr.length;
		int middle = (min + max) / 2;
		Arrays.sort(arr);
		
		while(middle != max && middle != min) {
			if(arr[middle] <= value) {
				min = middle;
			}else {
				max = middle;
			}
			middle = (min + max) / 2;
		}
		answer = arr[middle];
		
		return answer;
	}

}
