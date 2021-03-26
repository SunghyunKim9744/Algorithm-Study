package Level2And3Day2.숫자의표현;

//4:23 ~ 4:38
public class Dy {

	public static void main(String[] args) {
		int n = 15;

		
		solution(n);

	}
	// 테스트 2 〉	통과 (0.15ms, 52.6MB) 테스트 1 〉	통과 (0.31ms, 52.4MB)
	private static int solution(int n) {
		int answer = 0;
		for(int i = 1; i<n; i++) {
			if(n - ((i*i)+i)/2 >= 0) {
				int temp = n - ((i*i)+i)/2;
				if(temp % i == 0)
					answer++;
			}
		}
		return answer;
		
	}

}
