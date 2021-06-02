package Level2Day04.점프와순간이동;

public class Sh {

	public static void main(String[] args) {
		int n = 5;
		
		int answer = solution(n);

	}

	private static int solution(int n) {
		int ans = Integer.bitCount(n);


        return ans;
	}

}
