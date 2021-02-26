package Day06.키패드누르기;

public class HJ {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }; // LRLLLRLLRRL
		String hand = "right";
		System.out.println(solution(numbers, hand));
	}

//	// 방법 1) (0.04ms, 53.8MB) - (1.08ms, 53.3MB)
//	public static String solution(int[] numbers, String hand) {
//		StringBuilder sb = new StringBuilder();
//		int[][] keypad = {
//							{ 1, 2, 3 },
//							{ 4, 5, 6 },
//							{ 7, 8, 9 },
//							{ -1, 0, -1 }
//						};
//		int[] position = { -1, -1 };
//
//		for (int num : numbers) {
//			switch (num) {
//			case 1:
//			case 4:
//			case 7:
//				position[0] = num;
//				sb.append("L");
//				break;
//
//			case 3:
//			case 6:
//			case 9:
//				position[1] = num;
//				sb.append("R");
//				break;
//
//			default:
//				int[] numIdx = new int[2];
//				int[] left = new int[2];
//				int[] right = new int[2];
//				int[] distances = new int[2];
//
//				// 인덱스 번호 갖고 오기
//				for (int i = 0; i < 4; i++)
//					for (int j = 0; j < 3; j++) {
//						// current number
//						if (num == keypad[i][j]) {
//							numIdx[0] = i;
//							numIdx[1] = j;
//						}
//
//						// left
//						if (position[0] == keypad[i][j]) {
//							left[0] = i;
//							left[1] = j;
//						}
//
//						// right
//						if (position[1] == keypad[i][j]) {
//							right[0] = i;
//							right[1] = j;
//						}
//					}
//
//				// 거리 측정
//				distances[0] = Math.abs(numIdx[0] - left[0]) + Math.abs(numIdx[1] - left[1]);
//				distances[1] = Math.abs(numIdx[0] - right[0]) + Math.abs(numIdx[1] - right[1]);
//				
//				// 거리에 따른 키패드 입력 선택
//				if (distances[0] < distances[1]) {
//					position[0] = num;
//					sb.append("L");
//				}
//				else if (distances[0] > distances[1]) {
//					position[1] = num;
//					sb.append("R");
//				}
//				else {
//					if (hand.equals("right")) {
//						position[1] = num;
//						sb.append("R");
//					}
//					else {
//						position[0] = num;
//						sb.append("L");
//					}
//				}
//			}
//		}
//
//		return sb.toString();
//	}

	// 방법 2) (0.04ms, 53.8MB) - (1.84ms, 52.5MB)
	public static String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int left = 9;
		int right = 11;

		for (int num : numbers) {
			if (num == 0)
				num = 11;

			num = num - 1;

			switch (num % 3) {
			case 0:
				left = num;
				sb.append("L");
				break;

			case 2:
				right = num;
				sb.append("R");
				break;

			default:
				int distanceL = Math.abs(left / 3 - num / 3) + Math.abs(left % 3 - num % 3);
				int distanceR = Math.abs(right / 3 - num / 3) + Math.abs(right % 3 - num % 3);

				if (distanceL < distanceR) {
					left = num;
					sb.append("L");
				} else if (distanceL > distanceR) {
					right = num;
					sb.append("R");
				} else {
					switch (hand) {
					case "left":
						left = num;
						sb.append("L");
						break;
					case "right":
						right = num;
						sb.append("R");
						break;
					}
				}
			}
		}

		return sb.toString();
	}

}
