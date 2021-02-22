package Day3.문자열을정수로바꾸기;

public class Sh {

	public static void main(String[] args) {
		String s = "-1234";
		
		int answer = solution(s);
		
		System.out.println(answer);

	}
	
	public static int solution(String s) {
        int answer = 0;
        
        answer = Integer.parseInt(s);
        return answer;
    }

}
