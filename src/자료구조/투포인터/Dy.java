package 자료구조.투포인터;

public class Dy {

	public static void main(String[] args) {
		int[] arr = {1,2,7,4,2,5,3,1,1,2};
		
		int total = 5;
		System.out.println(solution(arr,total));
	}

	private static int solution(int[] arr, int total) {
		int answer = 0;
		
		int min = 0;
		int max = 0;
		int sum = 0;
		int play = 0;
		sum += arr[0];
		while(max >= min) {
			play++;
			if(sum == total) {
				answer++;
				max++;
				sum += arr[max];
			}else if((sum < total || min == max) && max < arr.length-1) {
				max++;
				sum += arr[max];
			}else {
				sum -= arr[min];
				min++;			 
			}
		}
		System.out.println(play);
		System.out.println(answer);
		
		return answer;
	}

}
