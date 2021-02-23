package Day4.짝수와홀수;

public class Sh {
	public static void main(String[] args) {
		int n = 3;
		
	}

	public static String solution(int num) {
		String answer = "";
		answer = num%2 == 0? "Even" : "Odd";
		return answer;
	}
}
