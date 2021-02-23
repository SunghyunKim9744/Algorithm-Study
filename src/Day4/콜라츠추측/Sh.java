package Day4.콜라츠추측;

public class Sh {
	public static void main(String[] args) {
		int n = 626331;
		System.out.println(solution(n));
	}

	public static int solution(long num) {
		int answer = 0;
		while (num != 1) {
			if (answer >= 500)
				return -1;

			else if (num % 2 == 0) {
				num /= 2;
				answer++;
				System.out.println(num);
			} 
			else {
				num = num*3 + 1;
				answer++;
				System.out.println(num);
			}
		}

		return answer;
	}

}
