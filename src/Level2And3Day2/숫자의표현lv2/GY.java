package Level2And3Day2.숫자의표현lv2;

public class GY {

	public static void main(String[] args) {
		int n = 15;

		solution(n);
		System.out.println("aaa");

	}

	// 정확성 0.02ms ~ 0.11ms
	// 효율성 0.56ms ~ 1.04ms
	private static int solution(int n) {
		int answer = 0;

		int sum = 0;
		int start = 0;
		int end = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		while (start < n) {
			if (sum > n || end == n) {
				sum -= arr[start];
				start++;
//				System.out.println("start : " + start);
			} else if (sum < n) {
				sum += arr[end];
				if (end < n - 1)
					end++;
//				System.out.println("end : " + arr[end]);
			}

			if (sum == n) {
				System.out.println(answer + " " + arr[start] + " " + arr[end]);
				answer++;
				sum -= arr[start];
				start++;
				sum += arr[end];
				end++;
			}

		}

//		System.out.println("answer : " + answer);

		return answer;

	}

}

//public int solution(int n) {
//    int answer = 0;
//    		
//	for (int i = 1; i <= n; i++) {
//		int sum = 0;
//		for (int j = i; j <= n; j++) {
//			if (sum < n) {
//				sum += j;
//			} else if (sum == n) {
//				answer++;
//				sum = 0;
//				break;
//			} else {
//				sum = 0;
//				break;
//			}
//		}
//	}
//
//	return answer+1;
//}
