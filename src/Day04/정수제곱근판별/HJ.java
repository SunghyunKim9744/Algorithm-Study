package Day04.정수제곱근판별;

public class HJ {
	public static void main(String[] args) {
		long n = 121;// 50000000000000L;
		System.out.println(solution(n));
	}

//	// 방법 1-1) (0.03ms, 53.6MB) - (19.11ms, 53.7MB)
//	public static long solution(long n) {
//		long answer = 0;
//
//		for (int i = 1; i <= n / 2; i++)
//			if (Math.sqrt(n) == (double) i) {
//				answer = i;
//				break;
//			}
//
//		answer = (answer == 0) ? -1 : (long) Math.pow(answer + 1, 2);
//		
//		return answer;
//	}
	
	// 방법 1-2) (0.03ms, 53.6MB) - (19.11ms, 53.7MB)
		public static long solution(long n) {
			
			return (long) (Math.pow(Math.sqrt(n), 2) == n ? Math.pow(Math.sqrt(n) + 1, 2) : -1);
		}

//	// 방법 2) 통과 (0.90ms, 53.1MB) - (시간 초과)
//	public static long solution(long n) {
//		long answer = 0;
//
//		for (long i = 1; i <= n / 2; i++)
//			if (i * i == n) {
//				answer = i;
//				break;
//			}
//		
//		answer = (answer == 0) ? -1 : (answer + 1) * (answer + 1);
//		
//		return answer;
//	}
}
