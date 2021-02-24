package Day03.수박수박수박수박수박수;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}

	public static String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++)
			answer += (i % 2 == 0) ? "수" : "박";

		return answer;
	}

}
