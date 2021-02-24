package Day4.제일작은수제거;

public class Sh {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		System.out.println(solution(arr));
	}

//	public static int[] solution(int[] arr) {
//		int[] answer = {};
//		
//		if(arr.length == 1) {
//			answer = new int[1];
//			answer[0] = -1;
//			return answer;
//		}
//		int min = Arrays.stream(arr).min().getAsInt();
//		
//		answer = new int[arr.length-1];
//		int index = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == min)
//				continue;
//			answer[index++] = arr[i];
//		}
//		return answer;
//	}
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
		
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		int min = arr[0];
		for(int i=0; i<arr.length-1; i++)
			if(arr[i+1] < min)
				min = arr[i+1];
		
		
		answer = new int[arr.length-1];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == min)
				continue;
			answer[index++] = arr[i];
		}
		return answer;
	}
}
