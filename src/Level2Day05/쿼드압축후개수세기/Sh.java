package Level2Day05.쿼드압축후개수세기;

public class Sh {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 0, 0 }, { 1, 0, 0, 0 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 } };

		int[] answer = solution(arr);
	}

	private static int[] solution(int[][] arr) {
		int[] answer = new int[2];
		int x = 0;
		int y = 0;
		int num = arr.length;
		func(arr, x, y, num, answer);
		return answer;
	}

	private static void func(int[][] arr, int x, int y, int num, int[] answer) {
		if (num == 1) {
			answer[arr[x][y]]++;
			return;
		}

		int value = arr[x][y];
		boolean bool = true;
		for (int i = x; i < x + num; i++) {
			for (int j = y; j < y + num; j++) {
				if (arr[i][j] != value) {
					bool = false;
					break;
				}
			}
			if (!bool)
				break;
		}
		if (bool) {
			answer[value]++;
			return;
		}

		num /= 2;

		func(arr, x, y, num, answer);
		func(arr, x + num, y, num, answer);
		func(arr, x, y + num, num, answer);
		func(arr, x + num, y + num, num, answer);

	}

//	private static int[] solution(int[][] arr) {
//		int[] answer = new int[2];
//        int start = 0;
//        int end = arr.length;
//        func(arr,start,end,answer);
//        return answer;
//	}
//
//	private static void func(int[][] arr, int start, int end,int[] answer) {
//		if(end-start == 1) {
//			if(arr[start][start] == 0)
//				answer[0]++;
//			else
//				answer[1]++;
//			
//			return;
//		}
//		
//		
//		int value = arr[start][start];
//		boolean bool = true;
//		for(int i = start; i<end; i++) {
//			for(int j= start; j<end; j++) {
//				if(arr[i][j] != value) {
//					bool = false;
//					break;
//				}
//			}
//			if(!bool)
//				break;
//		}
//		
//		if(bool) {
//			answer[value]++;
//			return;
//		}
//		
//		int num = (end-start)/2;
//		func(arr, start, start+num, answer);
//		func(arr, start+num, end, answer);
//		
//	}

}
