package Day06.키패드누르기;

public class Sh {

	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";

		String answer = solution(numbers, hand);

	}

	// 9:36 ~ 10:34
	// (0.05ms, 52.4MB) - > (3.17ms, 52.6MB)
	// 시간이 오래 걸린 이유
	// 1. int[] numbers 인데 String[] numbers로 해버림 - > 문제를 잘 읽기
	// 2. 처음에 *과 #의 위치에 있다는 상황을 생각 못함 - > 기본적인 논리적 사고 부족.
	// 3. 눌러야할 번호와 현재 왼,오른손의 위치 거리를 구하는 알고리즘 - > 가장 오래 걸림 - > 기본적인 수학적 사고인데 너무 오래 걸림. + (0을 눌렀을 때 처리) 
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
