package Day05.하샤드수;

public class GY {

	public static void main(String[] args) {

		System.out.println(solution(10));
		System.out.println(solution(11));
		System.out.println(solution(12));
		System.out.println(solution(13));

	}

	public static boolean solution(int x) {
		boolean answer = true;

		// 방법 1 : 0.02 ~ 0.05
		int divisor = 0;
		int x2 = x;
		while (x2 > 0) {
			divisor += x2 % 10;
			x2 /= 10;
		}

		if (x % divisor != 0)
			return false;

		// 방법 2 : 0.14 ~ 0.29
//		String[] num = Integer.toString(x).split("");
//		int divisor = 0;
//		for (String s : num)
//			divisor += Integer.parseInt(s);
//
//		if (x % divisor != 0)
//			return false;

		return answer;
	}

}
