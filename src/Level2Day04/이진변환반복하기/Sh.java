package Level2Day04.이진변환반복하기;

public class Sh {

	public static void main(String[] args) {
		String s = "01110";

		int[] answer = solution(s);

	}

	private static int[] solution(String s) {
		int[] answer = new int[2];

		int count = 0;
		int zeroRemoveCnt = 0;

		while (!s.equals("1")) {
			int len = s.length();

			s = s.replace("0", "");

			zeroRemoveCnt += len - s.length();

			s = Integer.toBinaryString(s.length());
			count++;
		}

		answer[0] = count;
		answer[1] = zeroRemoveCnt;
		return answer;
	}

}
