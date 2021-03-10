package 자료구조;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = {6,5,3,2,1,0};
		
		// 0,1,2,3,5
		Arrays.sort(arr);
		
		int index = Arrays.binarySearch(arr,5);
		System.out.println(index);
	}

}
