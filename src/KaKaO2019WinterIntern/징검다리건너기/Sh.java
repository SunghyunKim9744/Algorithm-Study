package KaKaO2019WinterIntern.징검다리건너기;

public class Sh {

	public static void main(String[] args) {
		int[] stones = { 8 };
		int k = 3;

		int result = solution(stones, k);

		System.out.println(result);

	}

	private static int solution(int[] stones, int k) {
		int answer = 0;

		int start = 0;
		int end = 0;

		for (Integer i : stones) {
			if (end < i)
				end = i;
		}

		while (start <= end) {
			int mid = (start + end) / 2;

			int cnt = 0;
			int temp = 0;
			for (Integer i : stones) {
				int value = i - mid;
				// =
				if (value < 0) {
					temp++;
					//
					if (temp > cnt)
						cnt = temp;
				} else {
					if (temp > cnt)
						cnt = temp;
					temp = 0;
				}
			}
			if (cnt < k) {
				answer = mid;
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}

		}
		return answer;
	}

}
