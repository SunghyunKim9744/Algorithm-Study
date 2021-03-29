package Level2And3Day3.최솟값만들기lv2;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {
		int[] A1 = { 1, 4, 2 }, B1 = { 5, 4, 4 };
		int[] A2 = { 1, 2 }, B2 = { 3, 4 };

		System.out.println(solution(A1, B1));
		System.out.println(solution(A2, B2));

	}

	// (1.34ms, 53.1MB) - > (1.59ms, 52.9MB)
//	public static int solution(int[] A, int[] B) {
//		int answer = 0;
//		
//		Arrays.sort(A);
//		Arrays.sort(B);
//		
//		int len = A.length;
//		for(int i=0; i<len; i++)
//			answer+= A[i]*B[len-i-1];
//		
//
//		return answer;
//	}
	
	
	// Counting Sort
	// (0.24ms, 53.1MB) - > (0.28ms, 52.7MB)
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		
		int[] sortA = countSort(A);
		int[] sortB = countSort(B);
		
		int len = A.length;
		for(int i=0; i<len; i++)
			answer+= sortA[i]*sortB[len-i-1];
		

		return answer;
	}

	private static int[] countSort(int[] arr) {
		int[] temp = new int[1001];
		for(int i=0; i<arr.length; i++) {
			int index = arr[i];
			temp[index]++;
		}
		
		int[] sortArr = new int[arr.length];
		
		int count=0;
		for(int i=1; i<=1000; i++) {
			if(temp[i] != 0) {
				for(int j=0; j<temp[i]; j++)
					sortArr[count++] = i;
			}
		}
		return sortArr;
	}

}
