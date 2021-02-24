package Day02.문자열다루기기본;

public class Sh {

	public static void main(String[] args) {
		String s = "123456";
		
		boolean answer = solution(s);

	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        answer = s.matches("\\d{4}|\\d{6}");
        return answer;
    }

}
