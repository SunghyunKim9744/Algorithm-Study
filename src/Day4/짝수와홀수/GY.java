package Day4.짝수와홀수;

public class GY {

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	public static String solution(int num) {
        if(num%2 == 0)
        	return "Even";
        else
        	return "Odd";
    }
}
