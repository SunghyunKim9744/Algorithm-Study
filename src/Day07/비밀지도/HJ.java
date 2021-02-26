package Day07.비밀지도;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}

	// 방법 1) 직접 구현 : (0.06ms, 52.9MB) - (0.42ms, 52.5MB) 
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] map1 = getMap(arr1);
		String[] map2 = getMap(arr2);

		for (int i = 0; i < n; i++) {
			String line1 = map1[i];
			String line2 = map2[i];
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < n; j++) {
				if (line1.charAt(j) == '1' || line2.charAt(j) == '1')
					sb.append("#");
				else
					sb.append(" ");
			}

			answer[i] = sb.toString();
		}

		return answer;
	}

	public static String[] getMap(int[] arr) {
		String[] map = new String[arr.length];

		for (int i = 0, len = arr.length; i < len; i++) {
			StringBuilder sb = new StringBuilder();

			// 10진법 -> 2진법
			while (arr[i] > 0) {
				sb.append(arr[i] % 2);
				arr[i] /= 2;
			}

			// 보정
			while (sb.length() < arr.length)
				sb.append("0");
			sb.reverse();

			// 리스트에 담기
			map[i] = sb.toString();
		}

		return map;
	}

//	// 방법 2) 비트연산 : (0.39ms, 52MB) - (4.17ms, 53.1MB)
//	public static String[] solution(int n, int[] arr1, int[] arr2) {
//		String[] answer = new String[n];
//
//		for (int i = 0; i < n; i++) {
//			String line = Integer.toBinaryString(arr1[i] | arr2[i]);
//
//			while (line.length() < n)
//				line = "0" + line;
//
//			line = line.replaceAll("1", "#");
//			line = line.replaceAll("0", " ");
//			answer[i] = line;
//		}
//
//		return answer;
//	}

}
