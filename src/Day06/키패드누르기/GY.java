package Day06.키패드누르기;

import java.util.HashMap;
import java.util.Map;

public class GY {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		System.out.println(solution(numbers, hand));
	}

	// 0.04~4.33
//	public static String solution(int[] numbers, String hand) {
//
//		Map<String, String> map = new HashMap<>();
//		map.put("1", "1,1");
//		map.put("2", "1,2");
//		map.put("3", "1,3");
//		map.put("4", "2,1");
//		map.put("5", "2,2");
//		map.put("6", "2,3");
//		map.put("7", "3,1");
//		map.put("8", "3,2");
//		map.put("9", "3,3");
//		map.put("*", "4,1");
//		map.put("0", "4,2");
//		map.put("#", "4,3");
//
//		StringBuilder sb = new StringBuilder();
//		String leftHand = "*";
//		String rightHand = "#";
//		int leftDistance = 0; // 왼손에서 다음 번호까지의 거리
//		int rightDistance = 0; // 오른손에서 다음 번호까지의 거리
//		for (int i : numbers) {
//			switch (Integer.toString(i)) {
//			case "1":
//			case "4":
//			case "7":
//				sb.append("L");
//				leftHand = Integer.toString(i);
//				break;
//			case "3":
//			case "6":
//			case "9":
//				sb.append("R");
//				rightHand = Integer.toString(i);
//				break;
//			default:
//				
//				leftDistance = findDistance(map.get(Integer.toString(i)), map.get(leftHand));
//				rightDistance = findDistance(map.get(Integer.toString(i)), map.get(rightHand));
//				if (leftDistance < rightDistance) {
//					sb.append("L");
//					leftHand = Integer.toString(i);
//				} else if (leftDistance > rightDistance) {
//					sb.append("R");
//					rightHand = Integer.toString(i);
//				} else if (leftDistance == rightDistance) {
//					if (hand.equals("right")) {
//						sb.append("R");
//						rightHand = Integer.toString(i);
//					} else {
//						sb.append("L");
//						leftHand = Integer.toString(i);
//					}
//				}
//			}
//		}
//
//		return sb.toString();
//		
//	}
//
//	private static int findDistance(String target, String handLocation) {
//
//		int targetX = Integer.parseInt(target.substring(0, 1));
//		int targetY = Integer.parseInt(target.substring(2, 3));
//		int handX = Integer.parseInt(handLocation.substring(0, 1));
//		int handY = Integer.parseInt(handLocation.substring(2, 3));
//
//		return Math.abs(targetX - handX) + Math.abs(targetY - handY);
//
//	}

	// 0.04 ~ 1.13
	public static String solution(int[] numbers, String hand) {
		int leftPosition = 998;
		int rightPosition = 999;
		int phone[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 998, 0, 999 } };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				sb.append("L");
				leftPosition = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				sb.append("R");
				rightPosition = numbers[i];
			} else {
				int left = distance(leftPosition, numbers[i], phone);
				int right = distance(rightPosition, numbers[i], phone);

				if (left < right) {
					sb.append("L");
					leftPosition = numbers[i];
				} else if (right < left) {
					sb.append("R");
					rightPosition = numbers[i];
				} else {
					if (hand.equals("right")) {
						sb.append("R");
						rightPosition = numbers[i];
					} else {
						sb.append("L");
						leftPosition = numbers[i];
					}
				}
			}
		}
		return sb.toString();
	}

	static int distance(int position, int location, int phone[][]) {

		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

		for (int i = 0; i < phone.length; i++) {
			for (int j = 0; j < phone[0].length; j++) {
				if (phone[i][j] == position) {
					x1 = i;
					y1 = j;
				}
				if (phone[i][j] == location) {
					x2 = i;
					y2 = j;
				}
			}
		}

		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}

}
