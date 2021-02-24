package Day05.평균구하기;

public class HJ {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(solution(arr));
	}

	// (0.02ms, 52.2MB) - (0.04ms, 52.4MB)
	public static double solution(int[] arr) {
		double answer = 0;
		int size = arr.length;
		
		for (int i = 0; i < size; i++)
			answer += arr[i];
		
		return answer / size;
	}
}
