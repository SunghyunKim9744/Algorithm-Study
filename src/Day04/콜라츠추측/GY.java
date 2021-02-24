package Day04.콜라츠추측;

public class GY {

	public static void main(String[] args) {
		System.out.println("횟수 : " + solution(6));
		System.out.println("횟수 : " + solution(16));
		System.out.println("횟수 : " + solution(626331));
	}

	public static int solution(long num) {
		int answer = 0;

		while (num != 1) {
			if (num % 2 == 0)
				num /= 2;
			else
				num = num * 3 + 1;
			answer++;
			
			if (answer == 500)
				return -1;
		}

		return answer;
	}

}
