package Day2.문자열다루기기본;

public class HJ {
	public static void main(String[] args) {
		String s = "1234";
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
		boolean answer = false;

		if(s.length() != 4 && s.length() != 6)
			return answer;
		
		try {
			Integer.parseInt(s);
			answer = true;
		} catch(Exception e) {
			return answer;
		}
		
		return answer;
	}
}
