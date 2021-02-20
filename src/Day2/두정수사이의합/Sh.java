package Day2.두정수사이의합;

public class Sh {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		long answer = solution(a,b);

	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        
        if(a == b)
            return a;
        
        // 등차수열의 합 공식
        // ex) a = 1000만 , b = -100만 일 경우 int의 값 초과, long으로 형변환 - > 나머지 연산에서 묵시적 형변환
        answer = a > b ? (long)(a-b+1)*(b+a)/2 : (long)(b-a+1)*(a+b)/2;
        return answer;
    }

}
