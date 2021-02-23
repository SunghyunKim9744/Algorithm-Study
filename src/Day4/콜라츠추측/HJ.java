package Day4.콜라츠추측;

public class HJ {
	public static void main(String[] args) {
		int n = 626331;// 8000000;
		System.out.println(solution(n));
	}

	// (0.02ms, 53MB) - (0.07ms, 52.8MB)
	public static int solution(int num) {
		int answer = 0;
		long numL = (long) num;

		while (numL != 1 && answer < 501) {
			numL = (numL % 2 == 0) ? numL /= 2 : (long) (numL * 3 + 1);
			answer++;
		}

		return answer > 500 ? -1 : answer;
	}

}
