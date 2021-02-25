package Day06.내적;

public class Sh {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		int answer = solution(a,b);

	}

	// 9:11 ~ 9:12
	// (0.02ms, 52.5MB) - > (0.07ms, 54.3MB)
//	private static int solution(int[] a, int[] b) {
//		int answer = 0;
//		
//		for(int i=0; i<a.length; i++)
//			answer += a[i]*b[i];
//		return answer;
//	}
	
	// (0.03ms, 52MB) - > (0.19ms, 51.9MB)
	private static int solution(int[] a, int[] b) {
		int answer = 0;
		int len = a.length;
		answer = func(a,b,len);
		return answer;
	}

	private static int func(int[] a, int[] b, int len) {
		
		if(len-1>=0)
			return a[len-1]*b[len-1]+func(a,b,len-1);
		
		else
			return 0;
	}
	

}
