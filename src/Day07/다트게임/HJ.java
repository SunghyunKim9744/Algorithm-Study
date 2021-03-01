package Day07.다트게임;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		String dartResult = "10D*2S#10S*";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int[] scores = new int[3];
		dartResult = dartResult.replace("10", "t");
		String[] stages = dartResult.split("(?=\\d|t)");

		for (int i = 0; i < 3; i++) {
			String[] dart = stages[i].split("");
			scores[i] = (dart[0].equals("t")) ? 10 : Integer.parseInt(dart[0]);

			switch (dart[1]) {
			case "D":
				scores[i] = (int) Math.pow(scores[i], 2);
				break;
			case "T":
				scores[i] = (int) Math.pow(scores[i], 3);
				break;
			default:
				break;
			}

			if (dart.length == 3) {
				switch (dart[2]) {
				case "*":
					if (i > 0)
						scores[i - 1] *= 2;
					scores[i] *= 2;
					break;
				case "#":
					scores[i] *= -1;
					break;
				}
			}
		}

		for (int i = 0; i < 3; i++)
			answer += scores[i];

		return answer;
	}
}
