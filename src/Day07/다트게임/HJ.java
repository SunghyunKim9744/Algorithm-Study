package Day07.다트게임;

public class HJ {
	public static void main(String[] args) {
		String dartResult = "10D2S#10S*";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		dartResult = dartResult.replace("10", "a");
		String[] scores =dartResult.split("(?=\\d|a)");

		for(String str : scores)
			System.out.println(str);
		return answer;
	}
}
