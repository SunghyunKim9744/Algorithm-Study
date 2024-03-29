package 자료구조.이분탐색;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {
		int[] arr = {3,10,15,19,22,27,30,30,30,30,30,30,30,30,30,35,40,50};
		
		int value = 60;
		
		int start = 0;
		int end = arr.length-1;
		
		System.out.println(Arrays.binarySearch(arr, 30));
		int position = -1;
		int val = 0;
		while(start <= end) {
			int mid = (start+end)/2;
			
			if(arr[mid] > value) {
				end = mid-1;
			}
			else {
				start = mid+1;
				position = mid;
				val = arr[mid];
			}
			
		}
		
		System.out.println("위치 : " + position + " , 값 : "+val);

	}

}
