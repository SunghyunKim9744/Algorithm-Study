package Day3.수박수박수박수박수박수;

public class HJ {
	/*
	 * 프로그래머스 다른 사람 풀이 꼭 볼것
	 */

	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}

//	// 방법 1
//	public static String solution(int n) {
//		String answer = "";
//
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < n; i++) {
//			StringBuilder temp = (i % 2 == 0) ? sb.append("수") : sb.append("박");
//		}
//
//		return answer = sb.toString();
//	}

	// 방법 2
	public static String solution(int n) {
		String[] items = { "수", "박" };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++)
			sb.append(items[i % 2]);

		return sb.toString();
	}
}
