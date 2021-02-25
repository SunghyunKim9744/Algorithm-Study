package Day06.키패드누르기;

public class Sh {

	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";

		String answer = solution(numbers, hand);

	}

	// 9:36 ~ 10:34
	private static String solution(int[] numbers, String hand) {
		String answer = "";
		StringBuilder strb = new StringBuilder();

		int leftNum = 10;
		int rightNum = 12;

		for (int i = 0; i < numbers.length; i++) {
			if ("147".contains(String.valueOf(numbers[i]))) {
				leftNum = numbers[i];

				strb.append("L");
			}

			else if ("369".contains(String.valueOf(numbers[i]))) {
				rightNum = numbers[i];

				strb.append("R");
			}

			else {

				int leftDistance = Math.abs(leftNum - numbers[i]) / 3 + Math.abs(leftNum - numbers[i]) % 3;
				int rightDistance = Math.abs(rightNum - numbers[i]) / 3 + Math.abs(rightNum - numbers[i]) % 3;
				if (numbers[i] == 0) {
					leftDistance = Math.abs(leftNum - 11) / 3 + Math.abs(leftNum - 11) % 3;
					rightDistance = Math.abs(rightNum - 11) / 3 + Math.abs(rightNum - 11) % 3;

				}

				if (leftDistance > rightDistance) {
					strb.append("R");
					rightNum = numbers[i];
					if(numbers[i] == 0)
						rightNum = 11;
				} else if (leftDistance < rightDistance) {
					strb.append("L");
					leftNum = numbers[i];
					if(numbers[i] == 0)
						leftNum = 11;
				} else {
					if (hand.equals("right")) {
						strb.append("R");
						rightNum = numbers[i];
						if(numbers[i] == 0)
							rightNum = 11;
					} else {
						strb.append("L");
						leftNum = numbers[i];
						if(numbers[i] == 0)
							leftNum = 11;
					}

				}

			}

		}
		answer = strb.toString();
		System.out.println(answer);
		return answer;
	}

}
