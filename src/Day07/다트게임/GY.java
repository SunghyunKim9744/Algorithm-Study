package Day07.다트게임;

public class GY {
	public static void main(String[] args) {

		String dartResult1 = "1S2D*3T";
		String dartResult2 = "1D2S#10S";
		String dartResult3 = "1D2S0T";
		String dartResult4 = "1S*2T*3S";
		String dartResult5 = "1D#2S*3S";
		String dartResult6 = "1T2D3D#";
		String dartResult7 = "1D2S3T*";

		System.out.println(solution(dartResult1));

	}

	// 0.04 ~ 0.13
	public static int solution(String dartResult) {
		int answer = 0;
		// 구현하다 포기
//		int[] sdt = new int[3];
//		int sdtIndex = 0;
//		for (int i = 0; i < dartResult.length(); i++) {
//			if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T') {
//				sdt[sdtIndex] = i;
//				sdtIndex++;
//			}
//		}

//		System.out.println(Arrays.toString(sdt));

		char[] array = dartResult.toCharArray();
		int[] scores = new int[3];
		int Index = -1;
		for (int i = 0; i < array.length; i++) {
			if ('0' <= array[i] && array[i] <= '9') {
				Index++;
				scores[Index] = array[i] - '0';
				if (array[i] == '1' && array[i + 1] == '0') {
					scores[Index] = 10;
					i++;
				}
			} else if (array[i] == 'S') {
				continue;
			} else if (array[i] == 'D') {
				scores[Index] = (int) Math.pow(scores[Index], 2);
			} else if (array[i] == 'T') {
				scores[Index] = (int) Math.pow(scores[Index], 3);
			} else if (array[i] == '*') {
				if (Index >= 1)
					scores[Index - 1] *= 2;
				scores[Index] *= 2;
			} else if (array[i] == '#') {
				scores[Index] *= -1;
			}
		}

		for (int i : scores)
			answer += i;

		return answer;
	}

}
