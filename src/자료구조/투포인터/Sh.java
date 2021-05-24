package 자료구조.투포인터;

public class Sh {


	/*
	 * 		1. 시작점과 끝점 0으로 초기화
	 * 		2. 현재 부분합이 M과 같은지 확인
	 * 		3. 현재 부분합이 M보다 작으면 end 1증가
	 * 		4. M보다 크거나 같으면 start 1 증가
	 * 		5. 2~4번 반복
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,5,3,1,1,2};
		
		int total = 5;
		
		//int start = 0;
		int end = 0;
		
		int count = arr.length;
		
		int sum = 0;
		int play = 0;
		int num = 0;
		for(int start=0; start<count; start++) {
			play++;
			while(sum < total && end < count) {
				sum+= arr[end];
				end++;
				play++;
			}
			
			if(sum == total) {
				System.out.println(start+" : "+(end-1));
				num++;
			}
			
			sum -= arr[start];
		}
		
		System.out.println(play);
	}

}
