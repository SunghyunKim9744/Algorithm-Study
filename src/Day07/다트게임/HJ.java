package Day07.다트게임;

public class HJ {
	public static void main(String[] args) {
		String dartResult = "10D2S#10S*";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int[] scores = new int[3];
		String[] darts = dartResult.split("");

		for (int i = 0, len = dartResult.length(); i < len; i++) {
			if(darts[i].equals("1") && darts[i+1].equals("1"))
			if (48 <= dartResult.charAt(i) && dartResult.charAt(i) <= 57) {
				int num = Integer.parseInt(darts[i]);
			}
		}

		return answer;
	}
}
