package Level2And3Day2.다음큰숫자;

public class Sh {

	public static void main(String[] args) {
		int n1 = 78;
		int n2 = 15;
		
		solution(n1);

	}

	private static int solution(int n) {
		int answer = 0;
		
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		
		if(n==4)
			return 1;
		for(int i =1; i<=n; i++)
			if(n%i==0)
				answer++;
		
	
	return answer;
		
		
	}

}
