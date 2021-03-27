package Level2And3Day1.nx2타일링lv3;

public class Sh {

	public static void main(String[] args) {
		
		int n = 9;
		
		System.out.println(solution(n));

	}

	private static int solution(int n) {
		int[] answer = new int[n+1];
		
		answer[1] = 1 % 1000000007;
		answer[2] = 2 % 1000000007;
		
		for(int i=3; i<=n; i++)
			answer[i] = (answer[i-2]+answer[i-1])%1000000007;
		return answer[n];
	}

//	private static int solution(int n) {
//		int answer = 0;
//		int widthCnt = 0;
//		int heightCnt = n;
//		
//		while(heightCnt>=0) {
//			int count = caseFunc(widthCnt,heightCnt);
//			widthCnt++;
//			heightCnt-=2;
//			answer+=count;
//		}
//		return answer;
//		
//	}
//
//	private static int caseFunc(int widthCnt, int heightCnt) {
//
//		
//		return factorial(widthCnt+heightCnt)/(factorial(widthCnt)*factorial(heightCnt));
//	}
//
//	private static int factorial(int num) {
//		if(num<=1)
//			return 1;
//		else
//			return num*factorial(num-1);
//	}

}
