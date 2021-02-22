package Day3.수박수박수박수박수박수;

public class HJ {
	/*
	 * 프로그래머스 다른 사람 풀이 꼭 볼것
	 */

	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}

	// 방법 1
	public static String solution(int n) {
		String answer = "";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			StringBuilder temp = (i % 2 == 0) ? sb.append("수") : sb.append("박");
		}

		return answer = sb.toString();
	}
}
