package Level2And3Day1.숫자124나라의숫자lv2;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(6));
		System.out.println(solution(7));
		System.out.println(solution(8));
		System.out.println(solution(9));
		System.out.println(solution(10));
	}

	// 9 : 40 ~ 10 : 05
	// 0.04ms ~ 0.05ms
	private static String solution(int n) {

		String answer = "";

		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			int rest = n % 3;
			if (rest == 0) {
				rest = 4;
				n--;
			}
			sb.append(rest);
			n /= 3;
		}
		
		answer = sb.reverse().toString();

		return answer;

	}

}

//public String solution(int n) {
//    String answer = "";
//	StringBuilder sb = new StringBuilder();
//
//	int rest = 0;
//	while (n > 0) {
//		rest = n % 3;
//		n = n / 3;
//		if (rest == 0) {
//			n -= 1;
//			rest = 4;
//		}
//		sb.append(rest);
//	}
//	
//	answer = sb.reverse().toString();
//	return answer;
//}