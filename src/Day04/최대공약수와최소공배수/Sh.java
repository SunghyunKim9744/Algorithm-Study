package Day04.최대공약수와최소공배수;

public class Sh {
	public static void main(String[] args) {
		int n = 1000000;
		int m = 1000000;
		System.out.println(solution(n, m));
	}

	public static int[] solution(int n, int m) {
		int[] answer = {};
		
		int max = 1;
		int min = 1;
		
		if(n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		// 최대 공약수
		for(int i=0; i<n; i++) 
			if(n % (i+1) ==0 && m % (i+1)==0) 
				max = i+1;
			
		
		// 최소 공배수
		for(int i=0; i<n; i++) 
			if(m*(i+1) % n ==0) {
				min = m*(i+1);
				break;
			}
		
		answer = new int[2];
		
		answer[0] = max;
		answer[1] = min;
		
		return answer;
	}

}
