package Day05.x만큼간격이있는n개의숫자;

public class Sh {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;

		long[] answer = solution(x,n);
	}

	// (0.02ms, 52MB) - > (0.06ms, 52.4MB)
	private static long[] solution(int x, int n) {
		long[] answer = {};
		answer = new long[n];
		for(int i=0; i<n; i++)
			answer[i] = x+(long)x*i;
		return answer;
	}
	
}
