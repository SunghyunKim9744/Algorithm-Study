package Level2Day02.예상대진표;

public class Dy {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		System.out.println(solution(n,a,b));

	}

	private static int solution(int n, int a, int b) {
        int answer = 0;
        
        while(a != b) {
        	answer++;
        	if(a % 2 == 0) {
        		a /= 2;
        	}else {
        		a /= 2;
        		a++;
        	}
        	
        	if(b % 2 == 0) {
        		b /= 2;
        	}else {
        		b /= 2;
        		b++;
        	}
        }

        return answer;
    }
}
