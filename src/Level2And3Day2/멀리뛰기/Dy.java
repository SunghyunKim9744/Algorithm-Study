package Level2And3Day2.멀리뛰기;

// 4:40 ~ 
public class Dy {

	public static void main(String[] args) {
		int n1 = 2000;
		int n2 = 3;
		
		solution(n1);
	}

	private static long solution(int n) {
		long answer = 0;
		long one = (long) n;
		long two = 0;
		long sum = 0;
		while(one >= 0) {
			sum = one + two;
			long temp = 1;
			for(int i = 0; i<two; i++) {
				temp = (temp * (sum-i) / (two - i));
			}
			answer = (answer + temp) % 1234567;
			one -= 2;
			two++;
		}
		return answer;
	}

}
