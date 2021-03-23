package 자료구조.투포인터;

public class GY_같은진행방향 {

//	n개의 정수를 가진 배열 A가 있을 때배열에서 *i,j까지 원소의 합이 m이 되는 경우의 수*을 구한다면 어떻게 해야할까?
//
//	두 포인터를 start, end라고 지칭할 때,  start = 0, end = 0 으로 시작한다이 때 두 포인터는 항상 `start <= end`여야 한다start는 해당 칸을 포함하고, end는 해당칸을 포함하지 않는다고 하자
//
//	`start < n`까지 반복한다
//
//	1) 현재 부분합이 m 초과이거나, end == n이면 start++
//
//	2) 아니라면 end++
//
//	3) 현재 부분합이 m이라면 결과 + 1

	public static void main(String[] args) {

	}

	private static void twoPointer(int N, int M, int[] arr) {

		long sum = 0;
		int start = 0;
		int end = 0;
		long result = 0;
		while (start < N) {
			if (sum > M || end == N) {
				sum -= arr[start];
				start++;
			} else {
				sum += arr[end];
				end++;
			}
			if (sum == M)
				result++;
		}
		System.out.println(result);
		
	}
}
