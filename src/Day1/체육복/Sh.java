package Day1.체육복;

public class Sh {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };

		int answer = solution(n, lost, reserve);

		System.out.println(answer);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int count = 0;

		for (int i = 0; i < lost.length; i++) {
			for (int j = count; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;

					break;
				}
			}
		}
		for (int i = 0; i < lost.length; i++) {
			for (int j = count; j < reserve.length; j++) {

				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;

					break;
				}

			}
		}

		int lostCnt = 0;
		for (int i = 0; i < lost.length; i++)
			if (lost[i] != -1)
				lostCnt++;

		answer = n - lostCnt;
		return answer;
	}
}
