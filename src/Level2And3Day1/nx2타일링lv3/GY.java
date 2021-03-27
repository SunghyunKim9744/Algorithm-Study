package Level2And3Day1.nx2타일링lv3;

//6:47 ~
public class GY {

	public static void main(String[] args) {
		
		int n = 9;
		
		System.out.println(solution(n));

	}

	private static int solution(int n) {
		int answer = 0;
		int result1 = 1;
        int result2 = 2;
        
        for(int i = 2;i<n;i++){
            answer = result1+result2;
            answer %= 1000000007;
            result1 = result2;
            result2 = answer;
        }
		return answer;
	}
}
